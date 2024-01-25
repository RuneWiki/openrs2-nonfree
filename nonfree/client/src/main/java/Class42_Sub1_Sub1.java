import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public final class Class42_Sub1_Sub1 extends Class42_Sub1 {

	@OriginalMember(owner = "client!cw", name = "J", descriptor = "I")
	public final int anInt1542;

	@OriginalMember(owner = "client!cw", name = "K", descriptor = "I")
	public final int anInt1543;

	@OriginalMember(owner = "client!cw", name = "M", descriptor = "F")
	public final float aFloat18;

	@OriginalMember(owner = "client!cw", name = "I", descriptor = "F")
	public final float aFloat17;

	@OriginalMember(owner = "client!cw", name = "L", descriptor = "Z")
	public final boolean aBoolean118;

	static {
		new Class175("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
	}

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lclient!gk;IIII[I)V")
	public Class42_Sub1_Sub1(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt1542 = arg1;
		this.anInt1543 = arg2;
		this.method1264(arg5, arg1, arg2);
		this.aFloat18 = (float) arg2 / (float) arg4;
		this.aFloat17 = (float) arg1 / (float) arg3;
		this.aBoolean118 = false;
		this.method1269(false, false);
	}

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lclient!gk;IIIII[BI)V")
	public Class42_Sub1_Sub1(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt1543 = arg3;
		this.anInt1542 = arg2;
		this.method1266(arg3, arg2, arg7, arg6, true);
		this.aFloat18 = (float) arg3 / (float) arg5;
		this.aBoolean118 = false;
		this.aFloat17 = (float) arg2 / (float) arg4;
		this.method1269(false, false);
	}

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lclient!gk;IIIIZ[BI)V")
	public Class42_Sub1_Sub1(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		if (super.anInt6241 == 34037) {
			this.aFloat17 = arg3;
			this.aFloat18 = arg4;
			this.aBoolean118 = false;
		} else {
			this.aFloat17 = this.aFloat18 = 1.0F;
			this.aBoolean118 = true;
		}
		this.anInt1543 = arg4;
		this.anInt1542 = arg3;
	}

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lclient!gk;IIIIIIZ)V")
	public Class42_Sub1_Sub1(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.anInt1543 = arg4;
		this.aBoolean118 = false;
		this.anInt1542 = arg3;
		this.aFloat17 = (float) arg3 / (float) arg5;
		this.aFloat18 = (float) arg4 / (float) arg6;
		this.method1269(false, false);
	}

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lclient!gk;IIIZ[I)V")
	public Class42_Sub1_Sub1(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		this.anInt1543 = arg3;
		if (super.anInt6241 == 34037) {
			this.aFloat18 = arg3;
			this.aFloat17 = arg2;
			this.aBoolean118 = false;
		} else {
			this.aFloat17 = this.aFloat18 = 1.0F;
			this.aBoolean118 = true;
		}
		this.anInt1542 = arg2;
	}

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lclient!gk;IIIIIZ)V")
	public Class42_Sub1_Sub1(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt1543 = arg5;
		if (super.anInt6241 == 34037) {
			this.aFloat18 = arg5;
			this.aBoolean118 = false;
			this.aFloat17 = arg4;
		} else {
			this.aFloat17 = this.aFloat18 = 1.0F;
			this.aBoolean118 = true;
		}
		this.anInt1542 = arg4;
	}
}
