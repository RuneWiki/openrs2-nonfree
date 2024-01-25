import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public final class Class3_Sub10_Sub13 extends Class3_Sub10 {

	@OriginalMember(owner = "client!pda", name = "q", descriptor = "I")
	public int anInt6876;

	@OriginalMember(owner = "client!pda", name = "r", descriptor = "I")
	public int anInt6877;

	@OriginalMember(owner = "client!pda", name = "s", descriptor = "I")
	public int anInt6878;

	@OriginalMember(owner = "client!pda", name = "t", descriptor = "I")
	public int anInt6879;

	@OriginalMember(owner = "client!pda", name = "w", descriptor = "I")
	public int anInt6880;

	@OriginalMember(owner = "client!pda", name = "y", descriptor = "Lclient!gl;")
	public final Class109 aClass109_2;

	@OriginalMember(owner = "client!pda", name = "v", descriptor = "Lclient!em;")
	public final Class75 aClass75_1;

	@OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(Lclient!gl;Lclient!kw;)V")
	public Class3_Sub10_Sub13(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class4_Sub4 arg1) {
		this.aClass109_2 = arg0;
		this.aClass75_1 = this.aClass109_2.method3130();
		this.method5767();
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(I)V")
	public void method5767() {
		this.anInt6876 = this.aClass109_2.anInt3779;
		this.anInt6877 = this.aClass109_2.anInt3780;
		this.anInt6880 = this.aClass109_2.anInt3778;
		if (this.aClass109_2.aClass205_4 != null) {
			this.aClass109_2.aClass205_4.R(this.aClass75_1.anInt2487, this.aClass75_1.anInt2479, this.aClass75_1.anInt2480, Static407.anIntArray657);
		}
		this.anInt6879 = Static407.anIntArray657[2];
		this.anInt6878 = Static407.anIntArray657[0];
	}
}
