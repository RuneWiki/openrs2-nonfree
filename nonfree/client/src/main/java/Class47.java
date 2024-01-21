import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class47 implements Interface2 {

	@OriginalMember(owner = "client!pc", name = "v", descriptor = "Lclient!oe;")
	private Class45 aClass45_6 = new Class45();

	@OriginalMember(owner = "client!pc", name = "I", descriptor = "I")
	private int anInt2087 = 0;

	@OriginalMember(owner = "client!pc", name = "J", descriptor = "I")
	private int anInt2088 = 128;

	@OriginalMember(owner = "client!pc", name = "M", descriptor = "D")
	private double aDouble9 = 1.0D;

	@OriginalMember(owner = "client!pc", name = "K", descriptor = "I")
	private final int anInt2089;

	@OriginalMember(owner = "client!pc", name = "O", descriptor = "Lclient!rb;")
	private final Class55 aClass55_32;

	@OriginalMember(owner = "client!pc", name = "p", descriptor = "[Lclient!ae;")
	private final Class1_Sub2[] aClass1_Sub2Array1;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lclient!rb;Lclient!rb;IDI)V")
	public Class47(@OriginalArg(0) Class55 arg0, @OriginalArg(1) Class55 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3, @OriginalArg(4) int arg4) {
		this.anInt2089 = arg2;
		this.aClass55_32 = arg1;
		this.aDouble9 = arg3;
		this.anInt2088 = arg4;
		this.anInt2087 = this.anInt2089;
		@Pc(38) int[] local38 = arg0.method1875(0);
		@Pc(41) int local41 = local38.length;
		this.aClass1_Sub2Array1 = new Class1_Sub2[arg0.method1865(0)];
		for (@Pc(50) int local50 = 0; local50 < local41; local50++) {
			@Pc(63) Class1_Sub5 local63 = new Class1_Sub5(arg0.method1867(local38[local50], 0));
			this.aClass1_Sub2Array1[local38[local50]] = new Class1_Sub2(local63);
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method1329(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub2 local8 = this.aClass1_Sub2Array1[arg0];
		if (local8 != null) {
			if (local8.anIntArray30 != null) {
				this.aClass45_6.method1297(local8);
				local8.aBoolean4 = true;
				return local8.anIntArray30;
			}
			@Pc(38) boolean local38 = local8.method79(this.aDouble9, this.anInt2088, this.aClass55_32);
			if (local38) {
				if (this.anInt2087 == 0) {
					@Pc(57) Class1_Sub2 local57 = (Class1_Sub2) this.aClass45_6.method1301();
					local57.method80();
				} else {
					this.anInt2087--;
				}
				this.aClass45_6.method1297(local8);
				local8.aBoolean4 = true;
				return local8.anIntArray30;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BI)V")
	public void method1332(@OriginalArg(1) int arg0) {
		for (@Pc(15) int local15 = 0; local15 < this.aClass1_Sub2Array1.length; local15++) {
			@Pc(22) Class1_Sub2 local22 = this.aClass1_Sub2Array1[local15];
			if (local22 != null && local22.anInt158 != 0 && local22.aBoolean4) {
				local22.method78(arg0);
				local22.aBoolean4 = false;
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method1328(@OriginalArg(1) int arg0) {
		return this.aClass1_Sub2Array1[arg0].aBoolean3;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
	public void method1334() {
		for (@Pc(12) int local12 = 0; local12 < this.aClass1_Sub2Array1.length; local12++) {
			if (this.aClass1_Sub2Array1[local12] != null) {
				this.aClass1_Sub2Array1[local12].method80();
			}
		}
		this.aClass45_6 = new Class45();
		this.anInt2087 = this.anInt2089;
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(II)Z")
	@Override
	public boolean method1330(@OriginalArg(0) int arg0) {
		return this.anInt2088 == 64;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(DB)V")
	public void method1336(@OriginalArg(0) double arg0) {
		this.aDouble9 = arg0;
		this.method1334();
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "(II)I")
	@Override
	public int method1331(@OriginalArg(0) int arg0) {
		return this.aClass1_Sub2Array1[arg0] == null ? 0 : this.aClass1_Sub2Array1[arg0].anInt156;
	}
}
