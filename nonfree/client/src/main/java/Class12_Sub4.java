import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class12_Sub4 extends Class12 {

	@OriginalMember(owner = "client!nf", name = "j", descriptor = "[I")
	public static final int[] anIntArray265 = new int[1000];

	@OriginalMember(owner = "client!nf", name = "t", descriptor = "Lclient!h;")
	public static Class89 aClass89_164 = null;

	@OriginalMember(owner = "client!nf", name = "q", descriptor = "Lclient!kk;")
	public static final Class127 aClass127_7 = new Class127("LOCAL", 4);

	@OriginalMember(owner = "client!nf", name = "v", descriptor = "I")
	public static int anInt4074 = 999999;

	@OriginalMember(owner = "client!nf", name = "w", descriptor = "[Lclient!bt;")
	public static final Class2_Sub4[] aClass2_Sub4Array1 = new Class2_Sub4[2048];

	@OriginalMember(owner = "client!nf", name = "l", descriptor = "I")
	public int anInt4068;

	@OriginalMember(owner = "client!nf", name = "m", descriptor = "[Lclient!au;")
	public Class12_Sub2[] aClass12_Sub2Array1;

	@OriginalMember(owner = "client!nf", name = "o", descriptor = "I")
	public int anInt4070;

	@OriginalMember(owner = "client!nf", name = "p", descriptor = "Lclient!hp;")
	public Class11 aClass11_1;

	@OriginalMember(owner = "client!nf", name = "r", descriptor = "I")
	public int anInt4071;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IBILclient!wm;)Z", line = 80)
	public boolean method4026(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class19 arg2) {
		if (this.aClass12_Sub2Array1 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.aClass12_Sub2Array1.length; local15++) {
				if (this.aClass12_Sub2Array1[local15].method432(arg1, arg0) && this.aClass11_1.method6069(arg1, arg0, arg2)) {
					return true;
				}
			}
		}
		return false;
	}
}
