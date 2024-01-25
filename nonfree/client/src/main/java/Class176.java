import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jfa")
public final class Class176 {

	@OriginalMember(owner = "client!jfa", name = "b", descriptor = "J")
	private long aLong128;

	@OriginalMember(owner = "client!jfa", name = "g", descriptor = "Lclient!daa;")
	private Class4_Sub7 aClass4_Sub7_28;

	@OriginalMember(owner = "client!jfa", name = "d", descriptor = "I")
	private final int anInt4810;

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "[Lclient!daa;")
	private final Class4_Sub7[] aClass4_Sub7Array1;

	@OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "(I)V")
	public Class176(@OriginalArg(0) int arg0) {
		this.anInt4810 = arg0;
		this.aClass4_Sub7Array1 = new Class4_Sub7[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class4_Sub7 local20 = this.aClass4_Sub7Array1[local10] = new Class4_Sub7();
			local20.aClass4_Sub7_61 = local20;
			local20.aClass4_Sub7_62 = local20;
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(JI)Lclient!daa;")
	public Class4_Sub7 method4107(@OriginalArg(0) long arg0) {
		this.aLong128 = arg0;
		@Pc(27) Class4_Sub7 local27 = this.aClass4_Sub7Array1[(int) (arg0 & (long) (this.anInt4810 - 1))];
		for (this.aClass4_Sub7_28 = local27.aClass4_Sub7_62; this.aClass4_Sub7_28 != local27; this.aClass4_Sub7_28 = this.aClass4_Sub7_28.aClass4_Sub7_62) {
			if (this.aClass4_Sub7_28.aLong303 == arg0) {
				@Pc(42) Class4_Sub7 local42 = this.aClass4_Sub7_28;
				this.aClass4_Sub7_28 = this.aClass4_Sub7_28.aClass4_Sub7_62;
				return local42;
			}
		}
		this.aClass4_Sub7_28 = null;
		return null;
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(JLclient!daa;B)V")
	public void method4108(@OriginalArg(0) long arg0, @OriginalArg(1) Class4_Sub7 arg1) {
		if (arg1.aClass4_Sub7_61 != null) {
			arg1.method7963();
		}
		@Pc(21) Class4_Sub7 local21 = this.aClass4_Sub7Array1[(int) (arg0 & (long) (this.anInt4810 - 1))];
		arg1.aClass4_Sub7_62 = local21;
		arg1.aClass4_Sub7_61 = local21.aClass4_Sub7_61;
		arg1.aClass4_Sub7_61.aClass4_Sub7_62 = arg1;
		arg1.aLong303 = arg0;
		arg1.aClass4_Sub7_62.aClass4_Sub7_61 = arg1;
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(I)Lclient!daa;")
	public Class4_Sub7 method4109() {
		if (this.aClass4_Sub7_28 == null) {
			return null;
		}
		@Pc(29) Class4_Sub7 local29 = this.aClass4_Sub7Array1[(int) ((long) (this.anInt4810 - 1) & this.aLong128)];
		while (this.aClass4_Sub7_28 != local29) {
			if (this.aClass4_Sub7_28.aLong303 == this.aLong128) {
				@Pc(45) Class4_Sub7 local45 = this.aClass4_Sub7_28;
				this.aClass4_Sub7_28 = this.aClass4_Sub7_28.aClass4_Sub7_62;
				return local45;
			}
			this.aClass4_Sub7_28 = this.aClass4_Sub7_28.aClass4_Sub7_62;
		}
		this.aClass4_Sub7_28 = null;
		return null;
	}
}
