import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class190 {

	@OriginalMember(owner = "client!t", name = "a", descriptor = "I")
	private int anInt5778 = 0;

	@OriginalMember(owner = "client!t", name = "f", descriptor = "I")
	private int anInt5779 = 0;

	@OriginalMember(owner = "client!t", name = "d", descriptor = "Lclient!od;")
	private Class8 aClass8_1 = null;

	@OriginalMember(owner = "client!t", name = "b", descriptor = "Lclient!sq;")
	private final Class46_Sub2 aClass46_Sub2_36;

	@OriginalMember(owner = "client!t", name = "e", descriptor = "Lclient!bk;")
	private final Class23 aClass23_4;

	@OriginalMember(owner = "client!t", name = "c", descriptor = "[Lclient!tn;")
	private final Class17[] aClass17Array1;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lclient!sq;)V")
	public Class190(@OriginalArg(0) Class46_Sub2 arg0) {
		this.aClass46_Sub2_36 = arg0;
		this.aClass23_4 = new Class23(arg0);
		this.aClass17Array1 = new Class17[9];
		this.aClass17Array1[1] = new Class17_Sub7(arg0);
		this.aClass17Array1[2] = new Class17_Sub2(arg0, this.aClass23_4);
		this.aClass17Array1[4] = new Class17_Sub1(arg0, this.aClass23_4);
		this.aClass17Array1[5] = new Class17_Sub4(arg0, this.aClass23_4);
		this.aClass17Array1[6] = new Class17_Sub6(arg0);
		this.aClass17Array1[7] = new Class17_Sub5(arg0);
		this.aClass17Array1[3] = new Class17_Sub3(arg0);
		this.aClass17Array1[8] = this.aClass17Array1[4];
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIZ)V")
	public void method5267(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		if ((arg1 | arg0 != this.anInt5778) & this.anInt5779 != 0) {
			this.aClass17Array1[Integer.MAX_VALUE & this.anInt5779].method5300(arg0);
			this.anInt5778 = arg0;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ZIZI)V")
	public void method5268(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(14) boolean local14 = arg0 & this.aClass46_Sub2_36.method5138();
		if (!local14 && (arg1 == 4 || arg1 == 8)) {
			arg1 = 2;
		}
		if (arg1 != 0 && arg2) {
			arg1 |= Integer.MIN_VALUE;
		}
		if (arg1 != this.anInt5779) {
			if (this.anInt5779 != 0) {
				this.aClass17Array1[Integer.MAX_VALUE & this.anInt5779].method5299();
			}
			if (arg1 != 0) {
				this.aClass17Array1[arg1 & Integer.MAX_VALUE].method5297(arg2);
				this.aClass17Array1[Integer.MAX_VALUE & arg1].method5301(arg2);
			}
			this.anInt5779 = arg1;
			this.anInt5778 = Integer.MIN_VALUE;
			this.aClass8_1 = null;
		} else if (this.anInt5779 != 0) {
			this.aClass17Array1[this.anInt5779 & Integer.MAX_VALUE].method5301(arg2);
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!od;B)Z")
	public boolean method5269(@OriginalArg(0) Class8 arg0) {
		if (this.anInt5779 == 0) {
			return false;
		}
		if (arg0 != this.aClass8_1) {
			this.aClass17Array1[this.anInt5779 & Integer.MAX_VALUE].method5302(arg0);
			this.aClass8_1 = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(II)Z")
	public boolean method5270() {
		return this.aClass17Array1[3].method5298();
	}
}
