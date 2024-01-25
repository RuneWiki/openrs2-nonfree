import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dca")
public final class Class67 {

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "I")
	private int anInt2245 = 0;

	@OriginalMember(owner = "client!dca", name = "c", descriptor = "I")
	private int anInt2247 = 0;

	@OriginalMember(owner = "client!dca", name = "o", descriptor = "I")
	private int anInt2255 = 0;

	@OriginalMember(owner = "client!dca", name = "i", descriptor = "Lclient!bi;")
	private final Class13_Sub2 aClass13_Sub2_8;

	@OriginalMember(owner = "client!dca", name = "n", descriptor = "Lclient!lha;")
	private final Class213 aClass213_1;

	@OriginalMember(owner = "client!dca", name = "f", descriptor = "[Lclient!ng;")
	private final Class59[] aClass59Array1;

	@OriginalMember(owner = "client!dca", name = "l", descriptor = "Lclient!uh;")
	public final Class59_Sub8 aClass59_Sub8_1;

	@OriginalMember(owner = "client!dca", name = "<init>", descriptor = "(Lclient!bi;)V")
	public Class67(@OriginalArg(0) Class13_Sub2 arg0) {
		this.aClass13_Sub2_8 = arg0;
		this.aClass213_1 = new Class213(arg0);
		this.aClass59Array1 = new Class59[10];
		this.aClass59Array1[1] = new Class59_Sub4(arg0);
		this.aClass59Array1[2] = new Class59_Sub2(arg0, this.aClass213_1);
		this.aClass59Array1[4] = new Class59_Sub9(arg0, this.aClass213_1);
		this.aClass59Array1[5] = new Class59_Sub6(arg0, this.aClass213_1);
		this.aClass59Array1[6] = new Class59_Sub7(arg0);
		this.aClass59Array1[7] = new Class59_Sub1(arg0);
		this.aClass59Array1[3] = this.aClass59_Sub8_1 = new Class59_Sub8(arg0);
		this.aClass59Array1[8] = new Class59_Sub3(arg0, this.aClass213_1);
		this.aClass59Array1[9] = new Class59_Sub5(arg0, this.aClass213_1);
		if (!this.aClass59Array1[8].method8588()) {
			this.aClass59Array1[8] = this.aClass59Array1[4];
		}
		if (!this.aClass59Array1[9].method8588()) {
			this.aClass59Array1[9] = this.aClass59Array1[8];
		}
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(IZIBZI)V")
	public void method1888(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(5) boolean local5 = arg1 & this.aClass13_Sub2_8.method8121();
		if (!local5 && (arg0 == 4 || arg0 == 8 || arg0 == 9)) {
			if (arg0 == 4) {
				arg4 = arg2;
			}
			arg0 = 2;
		}
		if (arg0 != 0 && arg3) {
			arg0 |= Integer.MIN_VALUE;
		}
		if (arg0 != this.anInt2245) {
			if (this.anInt2245 != 0) {
				this.aClass59Array1[Integer.MAX_VALUE & this.anInt2245].method8590();
			}
			if (arg0 != 0) {
				this.aClass59Array1[arg0 & Integer.MAX_VALUE].method8593(arg3);
				this.aClass59Array1[arg0 & Integer.MAX_VALUE].method8591(arg3);
				this.aClass59Array1[arg0 & Integer.MAX_VALUE].method8589(arg4, arg2);
			}
			this.anInt2245 = arg0;
			this.anInt2255 = arg4;
			this.anInt2247 = arg2;
		} else if (this.anInt2245 != 0) {
			this.aClass59Array1[this.anInt2245 & Integer.MAX_VALUE].method8591(arg3);
			if (this.anInt2247 != arg2 || this.anInt2255 != arg4) {
				this.aClass59Array1[Integer.MAX_VALUE & this.anInt2245].method8589(arg4, arg2);
				this.anInt2255 = arg4;
				this.anInt2247 = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(BLclient!cj;I)Z")
	public boolean method1889(@OriginalArg(1) Class10 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt2245 == 0) {
			return false;
		} else {
			this.aClass59Array1[this.anInt2245 & Integer.MAX_VALUE].method8587(arg1, arg0);
			return true;
		}
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(II)Z")
	public boolean method1890() {
		return this.aClass59Array1[3].method8588();
	}
}
