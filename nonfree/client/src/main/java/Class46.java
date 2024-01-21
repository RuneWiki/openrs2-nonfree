import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class46 implements Interface2 {

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "Lclient!da;")
	private Class13 aClass13_41 = new Class13();

	@OriginalMember(owner = "client!mb", name = "s", descriptor = "D")
	private double aDouble9 = 1.0D;

	@OriginalMember(owner = "client!mb", name = "y", descriptor = "I")
	private int anInt1543 = 0;

	@OriginalMember(owner = "client!mb", name = "C", descriptor = "I")
	private int anInt1545 = 128;

	@OriginalMember(owner = "client!mb", name = "r", descriptor = "Lclient!g;")
	private final Class26 aClass26_15;

	@OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
	private final int anInt1541;

	@OriginalMember(owner = "client!mb", name = "o", descriptor = "[Lclient!kc;")
	private final Class2_Sub13[] aClass2_Sub13Array1;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lclient!g;Lclient!g;IDI)V")
	public Class46(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3, @OriginalArg(4) int arg4) {
		this.aClass26_15 = arg1;
		this.aDouble9 = arg3;
		this.anInt1545 = arg4;
		this.anInt1541 = arg2;
		this.anInt1543 = this.anInt1541;
		@Pc(38) int[] local38 = arg0.method1352(0);
		@Pc(41) int local41 = local38.length;
		this.aClass2_Sub13Array1 = new Class2_Sub13[arg0.method1369(0)];
		for (@Pc(50) int local50 = 0; local50 < local41; local50++) {
			@Pc(63) Class2_Sub10 local63 = new Class2_Sub10(arg0.method1358(local38[local50], 0));
			this.aClass2_Sub13Array1[local38[local50]] = new Class2_Sub13(local63);
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BD)V")
	public void method1062(@OriginalArg(1) double arg0) {
		this.aDouble9 = arg0;
		this.method1066();
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(II)V")
	public void method1063(@OriginalArg(1) int arg0) {
		for (@Pc(7) int local7 = 0; local7 < this.aClass2_Sub13Array1.length; local7++) {
			@Pc(14) Class2_Sub13 local14 = this.aClass2_Sub13Array1[local7];
			if (local14 != null && local14.anInt1389 != 0 && local14.aBoolean54) {
				local14.method963(arg0);
				local14.aBoolean54 = false;
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method1057(@OriginalArg(0) int arg0) {
		return this.aClass2_Sub13Array1[arg0].aBoolean53;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V")
	public void method1066() {
		for (@Pc(3) int local3 = 0; local3 < this.aClass2_Sub13Array1.length; local3++) {
			if (this.aClass2_Sub13Array1[local3] != null) {
				this.aClass2_Sub13Array1[local3].method965();
			}
		}
		this.aClass13_41 = new Class13();
		this.anInt1543 = this.anInt1541;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(II)I")
	@Override
	public int method1058(@OriginalArg(1) int arg0) {
		return this.aClass2_Sub13Array1[arg0] == null ? 0 : this.aClass2_Sub13Array1[arg0].anInt1387;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method1056(@OriginalArg(0) int arg0) {
		@Pc(13) Class2_Sub13 local13 = this.aClass2_Sub13Array1[arg0];
		if (local13 != null) {
			if (local13.anIntArray164 != null) {
				this.aClass13_41.method428(local13);
				local13.aBoolean54 = true;
				return local13.anIntArray164;
			}
			@Pc(40) boolean local40 = local13.method964(this.aDouble9, this.anInt1545, this.aClass26_15);
			if (local40) {
				if (this.anInt1543 == 0) {
					@Pc(54) Class2_Sub13 local54 = (Class2_Sub13) this.aClass13_41.method423();
					local54.method965();
				} else {
					this.anInt1543--;
				}
				this.aClass13_41.method428(local13);
				local13.aBoolean54 = true;
				return local13.anIntArray164;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method1059(@OriginalArg(1) int arg0) {
		return this.anInt1545 == 64;
	}
}
