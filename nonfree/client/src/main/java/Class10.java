import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class10 {

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "Lclient!hb;")
	private Class1 aClass1_23;

	@OriginalMember(owner = "client!bf", name = "y", descriptor = "J")
	private long aLong16;

	@OriginalMember(owner = "client!bf", name = "A", descriptor = "Lclient!hb;")
	private Class1 aClass1_24;

	@OriginalMember(owner = "client!bf", name = "z", descriptor = "I")
	private int anInt474 = 0;

	@OriginalMember(owner = "client!bf", name = "v", descriptor = "[Lclient!hb;")
	private final Class1[] aClass1Array1;

	@OriginalMember(owner = "client!bf", name = "s", descriptor = "I")
	private final int anInt470;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(I)V")
	public Class10(@OriginalArg(0) int arg0) {
		this.aClass1Array1 = new Class1[arg0];
		this.anInt470 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class1 local23 = this.aClass1Array1[local13] = new Class1();
			local23.aClass1_210 = local23;
			local23.aClass1_209 = local23;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(JI)Lclient!hb;")
	public Class1 method256(@OriginalArg(0) long arg0) {
		this.aLong16 = arg0;
		@Pc(26) Class1 local26 = this.aClass1Array1[(int) ((long) (this.anInt470 - 1) & arg0)];
		for (this.aClass1_23 = local26.aClass1_210; this.aClass1_23 != local26; this.aClass1_23 = this.aClass1_23.aClass1_210) {
			if (this.aClass1_23.aLong140 == arg0) {
				@Pc(44) Class1 local44 = this.aClass1_23;
				this.aClass1_23 = this.aClass1_23.aClass1_210;
				return local44;
			}
		}
		this.aClass1_23 = null;
		return null;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)Lclient!hb;")
	public Class1 method257() {
		this.anInt474 = 0;
		return this.method260();
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(B[Lclient!hb;)I")
	public int method259(@OriginalArg(1) Class1[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt470; local9++) {
			@Pc(16) Class1 local16 = this.aClass1Array1[local9];
			for (@Pc(19) Class1 local19 = local16.aClass1_210; local19 != local16; local19 = local19.aClass1_210) {
				arg0[local7++] = local19;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)Lclient!hb;")
	public Class1 method260() {
		@Pc(27) Class1 local27;
		if (this.anInt474 > 0 && this.aClass1_24 != this.aClass1Array1[this.anInt474 - 1]) {
			local27 = this.aClass1_24;
			this.aClass1_24 = local27.aClass1_210;
			return local27;
		}
		while (this.anInt470 > this.anInt474) {
			local27 = this.aClass1Array1[this.anInt474++].aClass1_210;
			if (local27 != this.aClass1Array1[this.anInt474 - 1]) {
				this.aClass1_24 = local27.aClass1_210;
				return local27;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILclient!hb;J)V")
	public void method263(@OriginalArg(1) Class1 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass1_209 != null) {
			arg0.method3141();
		}
		@Pc(21) Class1 local21 = this.aClass1Array1[(int) (arg1 & (long) (this.anInt470 - 1))];
		arg0.aLong140 = arg1;
		arg0.aClass1_209 = local21.aClass1_209;
		arg0.aClass1_210 = local21;
		arg0.aClass1_209.aClass1_210 = arg0;
		arg0.aClass1_210.aClass1_209 = arg0;
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)I")
	public int method264() {
		@Pc(10) int local10 = 0;
		for (@Pc(16) int local16 = 0; local16 < this.anInt470; local16++) {
			@Pc(23) Class1 local23 = this.aClass1Array1[local16];
			for (@Pc(26) Class1 local26 = local23.aClass1_210; local26 != local23; local26 = local26.aClass1_210) {
				local10++;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)Lclient!hb;")
	public Class1 method265() {
		if (this.aClass1_23 == null) {
			return null;
		}
		@Pc(21) Class1 local21 = this.aClass1Array1[(int) (this.aLong16 & (long) (this.anInt470 - 1))];
		while (local21 != this.aClass1_23) {
			if (this.aLong16 == this.aClass1_23.aLong140) {
				@Pc(36) Class1 local36 = this.aClass1_23;
				this.aClass1_23 = this.aClass1_23.aClass1_210;
				return local36;
			}
			this.aClass1_23 = this.aClass1_23.aClass1_210;
		}
		this.aClass1_23 = null;
		return null;
	}
}
