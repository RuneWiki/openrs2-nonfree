import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class147 implements Interface2 {

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "Lclient!ni;")
	private final Class143_Sub3 aClass143_Sub3_6;

	@OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
	public final int anInt3447;

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "[I")
	public final int[] anIntArray190;

	@OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
	public final int anInt3448;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "Lclient!jp;")
	private Class188 aClass188_1;

	@OriginalMember(owner = "client!hd", name = "k", descriptor = "[F")
	public float[] aFloatArray12;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Lclient!ni;Lclient!qda;Lclient!jp;)V")
	public Class147(@OriginalArg(0) Class143_Sub3 arg0, @OriginalArg(1) Class59 arg1, @OriginalArg(2) Class188 arg2) {
		this.aClass143_Sub3_6 = arg0;
		if (arg1 instanceof Class59_Sub1_Sub2) {
			@Pc(12) Class59_Sub1_Sub2 local12 = (Class59_Sub1_Sub2) arg1;
			this.anInt3447 = local12.anInt7701;
			this.anIntArray190 = local12.anIntArray268;
			this.anInt3448 = local12.anInt7709;
		} else if (arg1 instanceof Class59_Sub1_Sub3) {
			@Pc(32) Class59_Sub1_Sub3 local32 = (Class59_Sub1_Sub3) arg1;
			this.anIntArray190 = local32.anIntArray431;
			this.anInt3448 = local32.anInt7709;
			this.anInt3447 = local32.anInt7701;
		} else {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			this.aClass188_1 = arg2;
			if (this.anInt3448 != this.aClass188_1.anInt4422 || this.anInt3447 != this.aClass188_1.anInt4423) {
				throw new RuntimeException();
			}
			this.aFloatArray12 = this.aClass188_1.aFloatArray17;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method8514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) boolean arg4) {
		Static17.method267(arg0, 0, arg3, this.anInt3448, this.aFloatArray12, arg4 ? this.aClass143_Sub3_6.aClass5_Sub8_1.anIntArray507 : null, arg1, 0, this.aClass143_Sub3_6.aFloatArray46, this.aClass143_Sub3_6.aClass5_Sub8_1.anInt9183, arg2, this.anIntArray190);
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method8515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static17.method267(arg0, arg4, arg3, this.aClass143_Sub3_6.aClass5_Sub8_1.anInt9183, this.aClass143_Sub3_6.aFloatArray46, this.anIntArray190, arg1, arg5, this.aFloatArray12, this.anInt3448, arg2, this.aClass143_Sub3_6.aClass5_Sub8_1.anIntArray507);
	}
}
