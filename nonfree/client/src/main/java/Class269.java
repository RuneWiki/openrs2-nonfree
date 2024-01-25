import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class Class269 {

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
	private int anInt7650 = 0;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
	private int anInt7648 = 0;

	@OriginalMember(owner = "client!qk", name = "i", descriptor = "Lclient!vfa;")
	private Class52 aClass52_1 = null;

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
	private int anInt7651 = 0;

	@OriginalMember(owner = "client!qk", name = "f", descriptor = "Lclient!ag;")
	private final Class12_Sub1 aClass12_Sub1_32;

	@OriginalMember(owner = "client!qk", name = "e", descriptor = "Lclient!ica;")
	private final Class150 aClass150_4;

	@OriginalMember(owner = "client!qk", name = "h", descriptor = "[Lclient!ne;")
	private final Class7[] aClass7Array1;

	@OriginalMember(owner = "client!qk", name = "l", descriptor = "Lclient!de;")
	public final Class7_Sub2 aClass7_Sub2_1;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lclient!ag;)V")
	public Class269(@OriginalArg(0) Class12_Sub1 arg0) {
		this.aClass12_Sub1_32 = arg0;
		this.aClass150_4 = new Class150(arg0);
		this.aClass7Array1 = new Class7[10];
		this.aClass7Array1[1] = new Class7_Sub5(arg0);
		this.aClass7Array1[2] = new Class7_Sub4(arg0, this.aClass150_4);
		this.aClass7Array1[4] = new Class7_Sub9(arg0, this.aClass150_4);
		this.aClass7Array1[5] = new Class7_Sub7(arg0, this.aClass150_4);
		this.aClass7Array1[6] = new Class7_Sub8(arg0);
		this.aClass7Array1[7] = new Class7_Sub1(arg0);
		this.aClass7Array1[3] = this.aClass7_Sub2_1 = new Class7_Sub2(arg0);
		this.aClass7Array1[8] = new Class7_Sub6(arg0, this.aClass150_4);
		this.aClass7Array1[9] = new Class7_Sub3(arg0, this.aClass150_4);
		if (!this.aClass7Array1[8].method7784()) {
			this.aClass7Array1[8] = this.aClass7Array1[4];
		}
		if (!this.aClass7Array1[9].method7784()) {
			this.aClass7Array1[9] = this.aClass7Array1[8];
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(BLclient!vfa;I)Z")
	public boolean method6302(@OriginalArg(1) Class52 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt7651 == 0) {
			return false;
		}
		if (this.aClass52_1 != arg0) {
			this.aClass7Array1[Integer.MAX_VALUE & this.anInt7651].method7782(arg1, arg0);
			this.aClass52_1 = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)Z")
	public boolean method6303() {
		return this.aClass7Array1[3].method7784();
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IZIZII)V")
	public void method6305(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(15) boolean local15 = arg2 & this.aClass12_Sub1_32.method6413();
		if (!local15 && (arg4 == 4 || arg4 == 8 || arg4 == 9)) {
			if (arg4 == 4) {
				arg3 = arg1;
			}
			arg4 = 2;
		}
		if (arg4 != 0 && arg0) {
			arg4 |= Integer.MIN_VALUE;
		}
		if (this.anInt7651 != arg4) {
			if (this.anInt7651 != 0) {
				this.aClass7Array1[Integer.MAX_VALUE & this.anInt7651].method7785();
			}
			if (arg4 != 0) {
				this.aClass7Array1[Integer.MAX_VALUE & arg4].method7777(arg0);
				this.aClass7Array1[arg4 & Integer.MAX_VALUE].method7780(arg0);
				this.aClass7Array1[Integer.MAX_VALUE & arg4].method7783(arg3, arg1);
			}
			this.anInt7648 = arg3;
			this.anInt7650 = arg1;
			this.aClass52_1 = null;
			this.anInt7651 = arg4;
		} else if (this.anInt7651 != 0) {
			this.aClass7Array1[Integer.MAX_VALUE & this.anInt7651].method7780(arg0);
			if (arg1 != this.anInt7650 || arg3 != this.anInt7648) {
				this.aClass7Array1[Integer.MAX_VALUE & this.anInt7651].method7783(arg3, arg1);
				this.anInt7650 = arg1;
				this.anInt7648 = arg3;
			}
		}
	}
}
