import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public final class Class20_Sub1_Sub1 extends Class20_Sub1 {

	@OriginalMember(owner = "client!dg", name = "l", descriptor = "Z")
	public final boolean aBoolean158;

	@OriginalMember(owner = "client!dg", name = "p", descriptor = "F")
	public final float aFloat9;

	@OriginalMember(owner = "client!dg", name = "n", descriptor = "F")
	public final float aFloat8;

	@OriginalMember(owner = "client!dg", name = "o", descriptor = "I")
	public final int anInt1603;

	@OriginalMember(owner = "client!dg", name = "m", descriptor = "I")
	public final int anInt1602;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lclient!h;IIIIIZ)V")
	public Class20_Sub1_Sub1(@OriginalArg(0) Class32_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		if (this.anInt6563 == 34037) {
			this.aFloat9 = arg5;
			this.aFloat8 = arg4;
			this.aBoolean158 = false;
		} else {
			this.aBoolean158 = true;
			this.aFloat8 = this.aFloat9 = 1.0F;
		}
		this.anInt1603 = arg4;
		this.anInt1602 = arg5;
	}

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lclient!h;IIIIZ[BI)V")
	public Class20_Sub1_Sub1(@OriginalArg(0) Class32_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		if (this.anInt6563 == 34037) {
			this.aFloat9 = arg4;
			this.aBoolean158 = false;
			this.aFloat8 = arg3;
		} else {
			this.aFloat8 = this.aFloat9 = 1.0F;
			this.aBoolean158 = true;
		}
		this.anInt1602 = arg4;
		this.anInt1603 = arg3;
	}

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lclient!h;IIIII[BI)V")
	public Class20_Sub1_Sub1(@OriginalArg(0) Class32_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt1603 = arg2;
		this.anInt1602 = arg3;
		this.method1386(arg2, arg3, arg6, arg7, true);
		this.aFloat8 = (float) arg2 / (float) arg4;
		this.aFloat9 = (float) arg3 / (float) arg5;
		this.aBoolean158 = false;
		this.method1388(false, false);
	}

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lclient!h;IIIIIIZ)V")
	public Class20_Sub1_Sub1(@OriginalArg(0) Class32_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aFloat8 = (float) arg3 / (float) arg5;
		this.aFloat9 = (float) arg4 / (float) arg6;
		this.anInt1602 = arg4;
		this.anInt1603 = arg3;
		this.aBoolean158 = false;
		this.method1388(false, false);
	}

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lclient!h;IIII[I)V")
	public Class20_Sub1_Sub1(@OriginalArg(0) Class32_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt1602 = arg2;
		this.anInt1603 = arg1;
		this.method1389(arg1, arg2, arg5);
		this.aFloat8 = (float) arg1 / (float) arg3;
		this.aFloat9 = (float) arg2 / (float) arg4;
		this.aBoolean158 = false;
		this.method1388(false, false);
	}

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lclient!h;IIIZ[I)V")
	public Class20_Sub1_Sub1(@OriginalArg(0) Class32_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		if (this.anInt6563 == 34037) {
			this.aFloat9 = arg3;
			this.aBoolean158 = false;
			this.aFloat8 = arg2;
		} else {
			this.aFloat8 = this.aFloat9 = 1.0F;
			this.aBoolean158 = true;
		}
		this.anInt1603 = arg2;
		this.anInt1602 = arg3;
	}
}
