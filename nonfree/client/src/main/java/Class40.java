import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class40 {

	@OriginalMember(owner = "client!gj", name = "g", descriptor = "J")
	private long aLong41;

	@OriginalMember(owner = "client!gj", name = "m", descriptor = "Lclient!id;")
	private Class3 aClass3_71;

	@OriginalMember(owner = "client!gj", name = "v", descriptor = "Lclient!id;")
	private Class3 aClass3_72;

	@OriginalMember(owner = "client!gj", name = "u", descriptor = "I")
	private int anInt1420 = 0;

	@OriginalMember(owner = "client!gj", name = "t", descriptor = "I")
	private final int anInt1419;

	@OriginalMember(owner = "client!gj", name = "r", descriptor = "[Lclient!id;")
	private final Class3[] aClass3Array1;

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(I)V")
	public Class40(@OriginalArg(0) int arg0) {
		this.anInt1419 = arg0;
		this.aClass3Array1 = new Class3[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class3 local23 = this.aClass3Array1[local13] = new Class3();
			local23.aClass3_213 = local23;
			local23.aClass3_214 = local23;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)Lclient!id;")
	public Class3 method1024() {
		@Pc(22) Class3 local22;
		if (this.anInt1420 > 0 && this.aClass3_72 != this.aClass3Array1[this.anInt1420 - 1]) {
			local22 = this.aClass3_72;
			this.aClass3_72 = local22.aClass3_213;
			return local22;
		}
		while (this.anInt1420 < this.anInt1419) {
			local22 = this.aClass3Array1[this.anInt1420++].aClass3_213;
			if (this.aClass3Array1[this.anInt1420 - 1] != local22) {
				this.aClass3_72 = local22.aClass3_213;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "(I)Lclient!id;")
	public Class3 method1026() {
		this.anInt1420 = 0;
		return this.method1024();
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!id;JI)V")
	public void method1027(@OriginalArg(0) Class3 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass3_214 != null) {
			arg0.method3320();
		}
		@Pc(26) Class3 local26 = this.aClass3Array1[(int) (arg1 & (long) (this.anInt1419 - 1))];
		arg0.aClass3_213 = local26;
		arg0.aLong147 = arg1;
		arg0.aClass3_214 = local26.aClass3_214;
		arg0.aClass3_214.aClass3_213 = arg0;
		arg0.aClass3_213.aClass3_214 = arg0;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)Lclient!id;")
	public Class3 method1028() {
		if (this.aClass3_71 == null) {
			return null;
		}
		@Pc(21) Class3 local21 = this.aClass3Array1[(int) (this.aLong41 & (long) (this.anInt1419 - 1))];
		while (local21 != this.aClass3_71) {
			if (this.aLong41 == this.aClass3_71.aLong147) {
				@Pc(36) Class3 local36 = this.aClass3_71;
				this.aClass3_71 = this.aClass3_71.aClass3_213;
				return local36;
			}
			this.aClass3_71 = this.aClass3_71.aClass3_213;
		}
		this.aClass3_71 = null;
		return null;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(JI)Lclient!id;")
	public Class3 method1029(@OriginalArg(0) long arg0) {
		this.aLong41 = arg0;
		@Pc(21) Class3 local21 = this.aClass3Array1[(int) ((long) (this.anInt1419 - 1) & arg0)];
		for (this.aClass3_71 = local21.aClass3_213; this.aClass3_71 != local21; this.aClass3_71 = this.aClass3_71.aClass3_213) {
			if (arg0 == this.aClass3_71.aLong147) {
				@Pc(43) Class3 local43 = this.aClass3_71;
				this.aClass3_71 = this.aClass3_71.aClass3_213;
				return local43;
			}
		}
		this.aClass3_71 = null;
		return null;
	}
}
