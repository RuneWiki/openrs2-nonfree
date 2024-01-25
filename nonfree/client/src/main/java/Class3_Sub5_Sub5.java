import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public final class Class3_Sub5_Sub5 extends Class3_Sub5 implements Interface14 {

	@OriginalMember(owner = "client!df", name = "t", descriptor = "I")
	private int anInt2009 = -1;

	@OriginalMember(owner = "client!df", name = "u", descriptor = "I")
	private int anInt2010 = -1;

	@OriginalMember(owner = "client!df", name = "A", descriptor = "Lclient!lf;")
	private final Class95_Sub3 aClass95_Sub3_10;

	@OriginalMember(owner = "client!df", name = "x", descriptor = "I")
	private final int anInt2013;

	@OriginalMember(owner = "client!df", name = "y", descriptor = "I")
	public final int anInt2014;

	@OriginalMember(owner = "client!df", name = "v", descriptor = "I")
	public final int anInt2011;

	@OriginalMember(owner = "client!df", name = "D", descriptor = "I")
	private int anInt2018;

	@OriginalMember(owner = "client!df", name = "G", descriptor = "I")
	private final int anInt2021;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lclient!lf;III)V")
	public Class3_Sub5_Sub5(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass95_Sub3_10 = arg0;
		this.anInt2013 = arg1;
		this.anInt2014 = arg2;
		this.anInt2011 = arg3;
		OpenGL.glGenRenderbuffersEXT(1, Static262.anIntArray270, 0);
		this.anInt2018 = Static262.anIntArray270[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt2018);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt2013, this.anInt2014, this.anInt2011);
		this.anInt2021 = this.anInt2011 * this.anInt2014 * this.aClass95_Sub3_10.method4859(this.anInt2013);
	}

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lclient!lf;IIII)V")
	public Class3_Sub5_Sub5(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt2013 = arg1;
		this.aClass95_Sub3_10 = arg0;
		this.anInt2014 = arg2;
		this.anInt2011 = arg3;
		OpenGL.glGenRenderbuffersEXT(1, Static262.anIntArray270, 0);
		this.anInt2018 = Static262.anIntArray270[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt2018);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt2013, this.anInt2014, this.anInt2011);
		this.anInt2021 = this.anInt2014 * this.anInt2011 * this.aClass95_Sub3_10.method4859(this.anInt2013);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
	@Override
	public void method6091() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt2009, this.anInt2010, 36161, 0);
		this.anInt2009 = -1;
		this.anInt2010 = -1;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(III)V")
	public void method1684(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg1, arg0, 36161, this.anInt2018);
		this.anInt2009 = arg1;
		this.anInt2010 = arg0;
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(I)V")
	public void method1686() {
		if (this.anInt2018 > 0) {
			this.aClass95_Sub3_10.method4887(this.anInt2018, this.anInt2021);
			this.anInt2018 = 0;
		}
	}

	@OriginalMember(owner = "client!df", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method1686();
		super.finalize();
	}
}
