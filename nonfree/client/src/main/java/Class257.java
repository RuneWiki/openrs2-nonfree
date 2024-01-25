import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class257 {

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
	private int anInt6833 = 0;

	@OriginalMember(owner = "client!vc", name = "k", descriptor = "I")
	private int anInt6835 = 0;

	@OriginalMember(owner = "client!vc", name = "j", descriptor = "Lclient!av;")
	private Class3 aClass3_1 = null;

	@OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
	private int anInt6838 = 0;

	@OriginalMember(owner = "client!vc", name = "i", descriptor = "Lclient!kd;")
	private final Class39_Sub2 aClass39_Sub2_40;

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "Lclient!uo;")
	private final Class249 aClass249_6;

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "[Lclient!td;")
	private final Class17[] aClass17Array1;

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "Lclient!vi;")
	public final Class17_Sub9 aClass17_Sub9_1;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lclient!kd;)V")
	public Class257(@OriginalArg(0) Class39_Sub2 arg0) {
		this.aClass39_Sub2_40 = arg0;
		this.aClass249_6 = new Class249(arg0);
		this.aClass17Array1 = new Class17[10];
		this.aClass17Array1[1] = new Class17_Sub1(arg0);
		this.aClass17Array1[2] = new Class17_Sub4(arg0, this.aClass249_6);
		this.aClass17Array1[4] = new Class17_Sub6(arg0, this.aClass249_6);
		this.aClass17Array1[5] = new Class17_Sub7(arg0, this.aClass249_6);
		this.aClass17Array1[6] = new Class17_Sub8(arg0);
		this.aClass17Array1[7] = new Class17_Sub5(arg0);
		this.aClass17Array1[3] = this.aClass17_Sub9_1 = new Class17_Sub9(arg0);
		this.aClass17Array1[8] = new Class17_Sub3(arg0, this.aClass249_6);
		this.aClass17Array1[9] = new Class17_Sub2(arg0, this.aClass249_6);
		if (!this.aClass17Array1[8].method5675()) {
			this.aClass17Array1[8] = this.aClass17Array1[4];
		}
		if (!this.aClass17Array1[9].method5675()) {
			this.aClass17Array1[9] = this.aClass17Array1[8];
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!av;IB)Z")
	public boolean method5614(@OriginalArg(0) Class3 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt6838 == 0) {
			return false;
		}
		if (this.aClass3_1 != arg0) {
			this.aClass17Array1[Integer.MAX_VALUE & this.anInt6838].method5668(arg0, arg1);
			this.aClass3_1 = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZZZI)V")
	public void method5616(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(5) boolean local5 = arg0 & this.aClass39_Sub2_40.method4542();
		if (!local5 && (arg2 == 4 || arg2 == 8)) {
			arg2 = 2;
		}
		if (arg2 != 0 && arg1) {
			arg2 |= Integer.MIN_VALUE;
		}
		if (this.anInt6838 != arg2) {
			if (this.anInt6838 != 0) {
				this.aClass17Array1[this.anInt6838 & Integer.MAX_VALUE].method5672();
			}
			if (arg2 != 0) {
				this.aClass17Array1[arg2 & Integer.MAX_VALUE].method5673(arg1);
				this.aClass17Array1[Integer.MAX_VALUE & arg2].method5674(arg1);
			}
			this.anInt6833 = Integer.MIN_VALUE;
			this.anInt6838 = arg2;
			this.anInt6835 = Integer.MIN_VALUE;
			this.aClass3_1 = null;
		} else if (this.anInt6838 != 0) {
			this.aClass17Array1[this.anInt6838 & Integer.MAX_VALUE].method5674(arg1);
		}
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(IB)Z")
	public boolean method5617() {
		return this.aClass17Array1[3].method5675();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)V")
	public void method5618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg0 != this.anInt6833 | arg1 != this.anInt6835) & this.anInt6838 != 0) {
			this.aClass17Array1[Integer.MAX_VALUE & this.anInt6838].method5671(arg0, arg1);
			this.anInt6833 = arg0;
			this.anInt6835 = arg1;
		}
	}
}
