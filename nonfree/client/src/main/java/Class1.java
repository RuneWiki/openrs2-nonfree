import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class Class1 implements Interface1 {

	@OriginalMember(owner = "client!a", name = "d", descriptor = "Lclient!cd;")
	private Class13 aClass13_1 = new Class13();

	@OriginalMember(owner = "client!a", name = "s", descriptor = "I")
	private int anInt14 = 128;

	@OriginalMember(owner = "client!a", name = "m", descriptor = "I")
	private int anInt8 = 0;

	@OriginalMember(owner = "client!a", name = "y", descriptor = "D")
	private double aDouble1 = 1.0D;

	@OriginalMember(owner = "client!a", name = "v", descriptor = "Lclient!na;")
	private final Class56 aClass56_1;

	@OriginalMember(owner = "client!a", name = "p", descriptor = "I")
	private final int anInt11;

	@OriginalMember(owner = "client!a", name = "j", descriptor = "[Lclient!nf;")
	private final Class2_Sub10[] aClass2_Sub10Array1;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Lclient!na;Lclient!na;IDI)V")
	public Class1(@OriginalArg(0) Class56 arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3, @OriginalArg(4) int arg4) {
		this.anInt14 = arg4;
		this.aClass56_1 = arg1;
		this.aDouble1 = arg3;
		this.anInt11 = arg2;
		this.anInt8 = this.anInt11;
		@Pc(38) int[] local38 = arg0.method1673(0);
		@Pc(41) int local41 = local38.length;
		this.aClass2_Sub10Array1 = new Class2_Sub10[arg0.method1678(0)];
		for (@Pc(50) int local50 = 0; local50 < local41; local50++) {
			@Pc(63) Class2_Sub4 local63 = new Class2_Sub4(arg0.method1666(local38[local50], 0));
			this.aClass2_Sub10Array1[local38[local50]] = new Class2_Sub10(local63);
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
	public void method9() {
		for (@Pc(13) int local13 = 0; local13 < this.aClass2_Sub10Array1.length; local13++) {
			if (this.aClass2_Sub10Array1[local13] != null) {
				this.aClass2_Sub10Array1[local13].method1309();
			}
		}
		this.aClass13_1 = new Class13();
		this.anInt8 = this.anInt11;
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub10 local8 = this.aClass2_Sub10Array1[arg0];
		if (local8 != null) {
			if (local8.anIntArray234 != null) {
				this.aClass13_1.method269(local8);
				local8.aBoolean67 = true;
				return local8.anIntArray234;
			}
			@Pc(43) boolean local43 = local8.method1311(this.aDouble1, this.anInt14, this.aClass56_1);
			if (local43) {
				if (this.anInt8 == 0) {
					@Pc(54) Class2_Sub10 local54 = (Class2_Sub10) this.aClass13_1.method274();
					local54.method1309();
				} else {
					this.anInt8--;
				}
				this.aClass13_1.method269(local8);
				local8.aBoolean67 = true;
				return local8.anIntArray234;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(BI)V")
	public void method11(@OriginalArg(1) int arg0) {
		for (@Pc(8) int local8 = 0; local8 < this.aClass2_Sub10Array1.length; local8++) {
			@Pc(15) Class2_Sub10 local15 = this.aClass2_Sub10Array1[local8];
			if (local15 != null && local15.anInt1747 != 0 && local15.aBoolean67) {
				local15.method1310(arg0);
				local15.aBoolean67 = false;
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(II)Z")
	@Override
	public boolean method8(@OriginalArg(0) int arg0) {
		return this.anInt14 == 64;
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(II)I")
	@Override
	public int method7(@OriginalArg(0) int arg0) {
		return this.aClass2_Sub10Array1[arg0] == null ? 0 : this.aClass2_Sub10Array1[arg0].anInt1749;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(BD)V")
	public void method12(@OriginalArg(1) double arg0) {
		this.aDouble1 = arg0;
		this.method9();
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method5(@OriginalArg(1) int arg0) {
		return this.aClass2_Sub10Array1[arg0].aBoolean66;
	}
}
