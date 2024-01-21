import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class7 {

	@OriginalMember(owner = "client!af", name = "j", descriptor = "J")
	private long aLong3;

	@OriginalMember(owner = "client!af", name = "s", descriptor = "Lclient!qe;")
	private Class8 aClass8_1;

	@OriginalMember(owner = "client!af", name = "w", descriptor = "Lclient!qe;")
	private Class8 aClass8_2;

	@OriginalMember(owner = "client!af", name = "u", descriptor = "I")
	private int anInt87 = 0;

	@OriginalMember(owner = "client!af", name = "d", descriptor = "[Lclient!qe;")
	private final Class8[] aClass8Array1;

	@OriginalMember(owner = "client!af", name = "t", descriptor = "I")
	private final int anInt86;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(I)V")
	public Class7(@OriginalArg(0) int arg0) {
		this.aClass8Array1 = new Class8[arg0];
		this.anInt86 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class8 local23 = this.aClass8Array1[local13] = new Class8();
			local23.aClass8_127 = local23;
			local23.aClass8_128 = local23;
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(JI)Lclient!qe;")
	public Class8 method45(@OriginalArg(0) long arg0) {
		this.aLong3 = arg0;
		@Pc(25) Class8 local25 = this.aClass8Array1[(int) ((long) (this.anInt86 - 1) & arg0)];
		for (this.aClass8_1 = local25.aClass8_128; this.aClass8_1 != local25; this.aClass8_1 = this.aClass8_1.aClass8_128) {
			if (arg0 == this.aClass8_1.aLong102) {
				@Pc(43) Class8 local43 = this.aClass8_1;
				this.aClass8_1 = this.aClass8_1.aClass8_128;
				return local43;
			}
		}
		this.aClass8_1 = null;
		return null;
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(I)Lclient!qe;")
	public Class8 method46() {
		@Pc(22) Class8 local22;
		if (this.anInt87 > 0 && this.aClass8_2 != this.aClass8Array1[this.anInt87 - 1]) {
			local22 = this.aClass8_2;
			this.aClass8_2 = local22.aClass8_128;
			return local22;
		}
		while (this.anInt86 > this.anInt87) {
			local22 = this.aClass8Array1[this.anInt87++].aClass8_128;
			if (local22 != this.aClass8Array1[this.anInt87 - 1]) {
				this.aClass8_2 = local22.aClass8_128;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(I)Lclient!qe;")
	public Class8 method47() {
		this.anInt87 = 0;
		return this.method46();
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!qe;BJ)V")
	public void method48(@OriginalArg(0) Class8 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass8_127 != null) {
			arg0.method2013();
		}
		@Pc(21) Class8 local21 = this.aClass8Array1[(int) (arg1 & (long) (this.anInt86 - 1))];
		arg0.aLong102 = arg1;
		arg0.aClass8_128 = local21;
		arg0.aClass8_127 = local21.aClass8_127;
		arg0.aClass8_127.aClass8_128 = arg0;
		arg0.aClass8_128.aClass8_127 = arg0;
	}

	@OriginalMember(owner = "client!af", name = "d", descriptor = "(I)Lclient!qe;")
	public Class8 method50() {
		if (this.aClass8_1 == null) {
			return null;
		}
		@Pc(21) Class8 local21 = this.aClass8Array1[(int) ((long) (this.anInt86 - 1) & this.aLong3)];
		while (local21 != this.aClass8_1) {
			if (this.aClass8_1.aLong102 == this.aLong3) {
				@Pc(36) Class8 local36 = this.aClass8_1;
				this.aClass8_1 = this.aClass8_1.aClass8_128;
				return local36;
			}
			this.aClass8_1 = this.aClass8_1.aClass8_128;
		}
		this.aClass8_1 = null;
		return null;
	}
}
