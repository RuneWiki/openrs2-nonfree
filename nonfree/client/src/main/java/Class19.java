import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class19 implements Interface4 {

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
	public static int anInt481 = 0;

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "[J")
	public static long[] aLongArray2 = new long[200];

	@OriginalMember(owner = "client!ea", name = "m", descriptor = "Lclient!o;")
	public static Class40 aClass40_137 = Static12.method257(" from your ignore list first");

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "Lclient!o;")
	public static Class40 aClass40_136 = Static12.method257("redstone3");

	@OriginalMember(owner = "client!ea", name = "p", descriptor = "Lclient!o;")
	public static Class40 aClass40_138 = Static12.method257("@gr2@");

	@OriginalMember(owner = "client!ea", name = "r", descriptor = "Lclient!o;")
	public static Class40 aClass40_139 = Static12.method257("Imported models");

	@OriginalMember(owner = "client!ea", name = "u", descriptor = "Lclient!o;")
	public static Class40 aClass40_140 = Static12.method257("Import complete");

	@OriginalMember(owner = "client!ea", name = "y", descriptor = "Lclient!o;")
	public static Class40 aClass40_141 = Static12.method257("This world is full)3");

	@OriginalMember(owner = "client!ea", name = "q", descriptor = "Lclient!od;")
	private Class44 aClass44_3 = new Class44();

	@OriginalMember(owner = "client!ea", name = "v", descriptor = "I")
	private int anInt489 = 0;

	@OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
	private int anInt488 = 128;

	@OriginalMember(owner = "client!ea", name = "D", descriptor = "D")
	private double aDouble1 = 1.0D;

	@OriginalMember(owner = "client!ea", name = "z", descriptor = "Lclient!ud;")
	private final Class5 aClass5_7;

	@OriginalMember(owner = "client!ea", name = "w", descriptor = "I")
	private final int anInt490;

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "[Lclient!hd;")
	private final Class2_Sub8[] aClass2_Sub8Array1;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB)Z", line = 5)
	@Override
	public boolean method394(@OriginalArg(0) int arg0) {
		return this.anInt488 == 64;
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(IB)[I", line = 36)
	@Override
	public int[] method397(@OriginalArg(0) int arg0) {
		@Pc(13) Class2_Sub8 local13 = this.aClass2_Sub8Array1[arg0];
		if (local13 != null) {
			if (local13.anIntArray185 != null) {
				this.aClass44_3.method1229(local13);
				local13.aBoolean71 = true;
				return local13.anIntArray185;
			}
			@Pc(38) boolean local38 = local13.method742(this.aDouble1, this.anInt488, this.aClass5_7);
			if (local38) {
				if (this.anInt489 == 0) {
					@Pc(57) Class2_Sub8 local57 = (Class2_Sub8) this.aClass44_3.method1218();
					local57.method741();
				} else {
					this.anInt489--;
				}
				this.aClass44_3.method1229(local13);
				local13.aBoolean71 = true;
				return local13.anIntArray185;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)V", line = 216)
	public void method401() {
		for (@Pc(3) int local3 = 0; local3 < this.aClass2_Sub8Array1.length; local3++) {
			if (this.aClass2_Sub8Array1[local3] != null) {
				this.aClass2_Sub8Array1[local3].method741();
			}
		}
		this.aClass44_3 = new Class44();
		this.anInt489 = this.anInt490;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)Z", line = 267)
	@Override
	public boolean method395(@OriginalArg(1) int arg0) {
		return this.aClass2_Sub8Array1[arg0].aBoolean70;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(DI)V", line = 815)
	public void method404(@OriginalArg(0) double arg0) {
		this.aDouble1 = arg0;
		this.method401();
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(IB)V", line = 827)
	public void method405(@OriginalArg(0) int arg0) {
		for (@Pc(3) int local3 = 0; local3 < this.aClass2_Sub8Array1.length; local3++) {
			@Pc(10) Class2_Sub8 local10 = this.aClass2_Sub8Array1[local3];
			if (local10 != null && local10.anInt994 != 0 && local10.aBoolean71) {
				local10.method739(arg0);
				local10.aBoolean71 = false;
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZI)I", line = 879)
	@Override
	public int method396(@OriginalArg(1) int arg0) {
		return this.aClass2_Sub8Array1[arg0] == null ? 0 : this.aClass2_Sub8Array1[arg0].anInt995;
	}

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lclient!ud;Lclient!ud;IDI)V", line = 935)
	public Class19(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3, @OriginalArg(4) int arg4) {
		this.anInt488 = arg4;
		this.aDouble1 = arg3;
		this.aClass5_7 = arg1;
		this.anInt490 = arg2;
		this.anInt489 = this.anInt490;
		@Pc(38) int[] local38 = arg0.method81(0);
		@Pc(41) int local41 = local38.length;
		this.aClass2_Sub8Array1 = new Class2_Sub8[arg0.method76(0)];
		for (@Pc(50) int local50 = 0; local50 < local41; local50++) {
			@Pc(63) Class2_Sub3 local63 = new Class2_Sub3(arg0.method68(local38[local50], 0));
			this.aClass2_Sub8Array1[local38[local50]] = new Class2_Sub8(local63);
		}
	}
}
