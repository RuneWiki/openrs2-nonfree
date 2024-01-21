import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class16 {

	@OriginalMember(owner = "client!d", name = "c", descriptor = "Lclient!od;")
	private Class3 aClass3_37;

	@OriginalMember(owner = "client!d", name = "t", descriptor = "J")
	private long aLong37;

	@OriginalMember(owner = "client!d", name = "C", descriptor = "Lclient!od;")
	private Class3 aClass3_38;

	@OriginalMember(owner = "client!d", name = "A", descriptor = "I")
	private int anInt735 = 0;

	@OriginalMember(owner = "client!d", name = "v", descriptor = "I")
	private final int anInt731;

	@OriginalMember(owner = "client!d", name = "w", descriptor = "[Lclient!od;")
	private final Class3[] aClass3Array1;

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(I)V")
	public Class16(@OriginalArg(0) int arg0) {
		this.anInt731 = arg0;
		this.aClass3Array1 = new Class3[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class3 local23 = this.aClass3Array1[local13] = new Class3();
			local23.aClass3_210 = local23;
			local23.aClass3_209 = local23;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!od;IJ)V")
	public void method546(@OriginalArg(0) Class3 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass3_209 != null) {
			arg0.method2783();
		}
		@Pc(21) Class3 local21 = this.aClass3Array1[(int) ((long) (this.anInt731 - 1) & arg1)];
		arg0.aClass3_209 = local21.aClass3_209;
		arg0.aClass3_210 = local21;
		arg0.aClass3_209.aClass3_210 = arg0;
		arg0.aClass3_210.aClass3_209 = arg0;
		arg0.aLong183 = arg1;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)I")
	public int method547() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt731; local9++) {
			@Pc(16) Class3 local16 = this.aClass3Array1[local9];
			@Pc(19) Class3 local19 = local16.aClass3_210;
			while (local16 != local19) {
				local19 = local19.aClass3_210;
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I[Lclient!od;)I")
	public int method548(@OriginalArg(1) Class3[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt731; local9++) {
			@Pc(16) Class3 local16 = this.aClass3Array1[local9];
			for (@Pc(19) Class3 local19 = local16.aClass3_210; local19 != local16; local19 = local19.aClass3_210) {
				arg0[local7++] = local19;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(I)Lclient!od;")
	public Class3 method551() {
		this.anInt735 = 0;
		return this.method552();
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(I)Lclient!od;")
	public Class3 method552() {
		if (this.anInt735 > 0 && this.aClass3Array1[this.anInt735 - 1] != this.aClass3_38) {
			@Pc(21) Class3 local21 = this.aClass3_38;
			this.aClass3_38 = local21.aClass3_210;
			return local21;
		}
		while (this.anInt735 < this.anInt731) {
			@Pc(49) Class3 local49 = this.aClass3Array1[this.anInt735++].aClass3_210;
			if (this.aClass3Array1[this.anInt735 - 1] != local49) {
				this.aClass3_38 = local49.aClass3_210;
				return local49;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IJ)Lclient!od;")
	public Class3 method554(@OriginalArg(1) long arg0) {
		this.aLong37 = arg0;
		@Pc(18) Class3 local18 = this.aClass3Array1[(int) (arg0 & (long) (this.anInt731 - 1))];
		for (this.aClass3_37 = local18.aClass3_210; this.aClass3_37 != local18; this.aClass3_37 = this.aClass3_37.aClass3_210) {
			if (arg0 == this.aClass3_37.aLong183) {
				@Pc(36) Class3 local36 = this.aClass3_37;
				this.aClass3_37 = this.aClass3_37.aClass3_210;
				return local36;
			}
		}
		this.aClass3_37 = null;
		return null;
	}

	@OriginalMember(owner = "client!d", name = "e", descriptor = "(I)Lclient!od;")
	public Class3 method555() {
		if (this.aClass3_37 == null) {
			return null;
		}
		@Pc(21) Class3 local21 = this.aClass3Array1[(int) (this.aLong37 & (long) (this.anInt731 - 1))];
		while (this.aClass3_37 != local21) {
			if (this.aLong37 == this.aClass3_37.aLong183) {
				@Pc(32) Class3 local32 = this.aClass3_37;
				this.aClass3_37 = this.aClass3_37.aClass3_210;
				return local32;
			}
			this.aClass3_37 = this.aClass3_37.aClass3_210;
		}
		this.aClass3_37 = null;
		return null;
	}
}
