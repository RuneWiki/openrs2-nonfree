import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class46 implements Interface1 {

	@OriginalMember(owner = "client!la", name = "u", descriptor = "Lclient!qb;")
	private Class58 aClass58_35 = new Class58();

	@OriginalMember(owner = "client!la", name = "v", descriptor = "I")
	private int anInt1708 = 128;

	@OriginalMember(owner = "client!la", name = "y", descriptor = "I")
	private int anInt1710 = 0;

	@OriginalMember(owner = "client!la", name = "w", descriptor = "D")
	private double aDouble9 = 1.0D;

	@OriginalMember(owner = "client!la", name = "z", descriptor = "I")
	private final int anInt1711;

	@OriginalMember(owner = "client!la", name = "B", descriptor = "Lclient!ff;")
	private final Class26 aClass26_11;

	@OriginalMember(owner = "client!la", name = "r", descriptor = "[Lclient!cf;")
	private final Class5_Sub7[] aClass5_Sub7Array1;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!ff;Lclient!ff;IDI)V")
	public Class46(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3, @OriginalArg(4) int arg4) {
		this.anInt1711 = arg2;
		this.anInt1710 = this.anInt1711;
		this.anInt1708 = arg4;
		this.aClass26_11 = arg1;
		this.aDouble9 = arg3;
		@Pc(38) int[] local38 = arg0.method1040(0);
		@Pc(41) int local41 = local38.length;
		this.aClass5_Sub7Array1 = new Class5_Sub7[arg0.method1031(0)];
		for (@Pc(50) int local50 = 0; local50 < local41; local50++) {
			@Pc(63) Class5_Sub14 local63 = new Class5_Sub14(arg0.method1038(0, local38[local50]));
			this.aClass5_Sub7Array1[local38[local50]] = new Class5_Sub7(local63);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method1151(@OriginalArg(1) int arg0) {
		return this.anInt1708 == 64;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(BI)I")
	@Override
	public int method1153(@OriginalArg(1) int arg0) {
		return this.aClass5_Sub7Array1[arg0] == null ? 0 : this.aClass5_Sub7Array1[arg0].anInt546;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method1152(@OriginalArg(1) int arg0) {
		return this.aClass5_Sub7Array1[arg0].aBoolean16;
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method1154(@OriginalArg(1) int arg0) {
		@Pc(14) Class5_Sub7 local14 = this.aClass5_Sub7Array1[arg0];
		if (local14 != null) {
			if (local14.anIntArray115 != null) {
				this.aClass58_35.method1674(local14);
				local14.aBoolean15 = true;
				return local14.anIntArray115;
			}
			@Pc(39) boolean local39 = local14.method414(this.aDouble9, this.anInt1708, this.aClass26_11);
			if (local39) {
				if (this.anInt1710 == 0) {
					@Pc(61) Class5_Sub7 local61 = (Class5_Sub7) this.aClass58_35.method1661();
					local61.method411();
				} else {
					this.anInt1710--;
				}
				this.aClass58_35.method1674(local14);
				local14.aBoolean15 = true;
				return local14.anIntArray115;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V")
	public void method1159() {
		for (@Pc(5) int local5 = 0; local5 < this.aClass5_Sub7Array1.length; local5++) {
			if (this.aClass5_Sub7Array1[local5] != null) {
				this.aClass5_Sub7Array1[local5].method411();
			}
		}
		this.aClass58_35 = new Class58();
		this.anInt1710 = this.anInt1711;
	}

	@OriginalMember(owner = "client!la", name = "d", descriptor = "(II)V")
	public void method1161(@OriginalArg(1) int arg0) {
		for (@Pc(3) int local3 = 0; local3 < this.aClass5_Sub7Array1.length; local3++) {
			@Pc(10) Class5_Sub7 local10 = this.aClass5_Sub7Array1[local3];
			if (local10 != null && local10.anInt545 != 0 && local10.aBoolean15) {
				local10.method413(arg0);
				local10.aBoolean15 = false;
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BD)V")
	public void method1162(@OriginalArg(1) double arg0) {
		this.aDouble9 = arg0;
		this.method1159();
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method1150(@OriginalArg(0) int arg0) {
		return true;
	}
}
