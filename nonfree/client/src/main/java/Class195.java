import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class Class195 implements Interface5 {

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
	private int anInt6019 = -1;

	@OriginalMember(owner = "client!tm", name = "g", descriptor = "Lclient!nf;")
	private final Class105_Sub1 aClass105_Sub1_38;

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
	public final int anInt6020;

	@OriginalMember(owner = "client!tm", name = "f", descriptor = "I")
	public final int anInt6021;

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
	private final int anInt6018;

	@OriginalMember(owner = "client!tm", name = "h", descriptor = "I")
	private int anInt6022;

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
	private final int anInt6017;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lclient!nf;III)V")
	public Class195(@OriginalArg(0) Class105_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass105_Sub1_38 = arg0;
		this.anInt6020 = arg2;
		this.anInt6021 = arg3;
		this.anInt6018 = arg1;
		@Pc(20) opengl local20 = this.aClass105_Sub1_38.anOpengl1;
		local20.glGenRenderbuffersEXT(1, Static299.anIntArray577, 0);
		this.anInt6022 = Static299.anIntArray577[0];
		local20.glBindRenderbufferEXT(36161, this.anInt6022);
		local20.glRenderbufferStorageEXT(36161, this.anInt6018, this.anInt6020, this.anInt6021);
		this.anInt6017 = this.anInt6020 * this.anInt6021 * this.aClass105_Sub1_38.method3563(this.anInt6018);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "()V")
	@Override
	public void method5567() {
		this.aClass105_Sub1_38.anOpengl1.glFramebufferRenderbufferEXT(36160, this.anInt6019, 36161, 0);
		this.anInt6019 = -1;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V")
	public void method5221(@OriginalArg(0) int arg0) {
		this.aClass105_Sub1_38.anOpengl1.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt6022);
		this.anInt6019 = arg0;
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "()V")
	public void method5222() {
		if (this.anInt6022 > 0) {
			this.aClass105_Sub1_38.method3636(this.anInt6022, this.anInt6017);
			this.anInt6022 = 0;
		}
	}

	@OriginalMember(owner = "client!tm", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method5222();
		super.finalize();
	}
}
