import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lr")
public final class Class219 {

	@OriginalMember(owner = "client!lr", name = "m", descriptor = "[J")
	public static final long[] aLongArray8 = new long[256];

	@OriginalMember(owner = "client!lr", name = "h", descriptor = "I")
	private int anInt5404 = 0;

	@OriginalMember(owner = "client!lr", name = "n", descriptor = "I")
	private int anInt5406 = 0;

	@OriginalMember(owner = "client!lr", name = "o", descriptor = "I")
	private int anInt5407 = 0;

	@OriginalMember(owner = "client!lr", name = "p", descriptor = "Lclient!pc;")
	private final Class33_Sub3 aClass33_Sub3_19;

	@OriginalMember(owner = "client!lr", name = "j", descriptor = "Lclient!od;")
	private final Class262 aClass262_4;

	@OriginalMember(owner = "client!lr", name = "i", descriptor = "[Lclient!dda;")
	private final Class44[] aClass44Array1;

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "Lclient!sja;")
	public final Class44_Sub8 aClass44_Sub8_1;

	static {
		for (@Pc(12) int local12 = 0; local12 < 256; local12++) {
			@Pc(16) long local16 = (long) local12;
			for (@Pc(18) int local18 = 0; local18 < 8; local18++) {
				if ((local16 & 0x1L) == 1L) {
					local16 = local16 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local16 >>>= 0x1;
				}
			}
			aLongArray8[local12] = local16;
		}
	}

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lclient!pc;)V")
	public Class219(@OriginalArg(0) Class33_Sub3 arg0) {
		this.aClass33_Sub3_19 = arg0;
		this.aClass262_4 = new Class262(arg0);
		this.aClass44Array1 = new Class44[10];
		this.aClass44Array1[1] = new Class44_Sub4(arg0);
		this.aClass44Array1[2] = new Class44_Sub5(arg0, this.aClass262_4);
		this.aClass44Array1[4] = new Class44_Sub3(arg0, this.aClass262_4);
		this.aClass44Array1[5] = new Class44_Sub9(arg0, this.aClass262_4);
		this.aClass44Array1[6] = new Class44_Sub7(arg0);
		this.aClass44Array1[7] = new Class44_Sub1(arg0);
		this.aClass44Array1[3] = this.aClass44_Sub8_1 = new Class44_Sub8(arg0);
		this.aClass44Array1[8] = new Class44_Sub2(arg0, this.aClass262_4);
		this.aClass44Array1[9] = new Class44_Sub6(arg0, this.aClass262_4);
		if (!this.aClass44Array1[8].method7666()) {
			this.aClass44Array1[8] = this.aClass44Array1[4];
		}
		if (!this.aClass44Array1[9].method7666()) {
			this.aClass44Array1[9] = this.aClass44Array1[8];
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(II)Z")
	public boolean method4753() {
		return this.aClass44Array1[3].method7666();
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILclient!fha;I)Z")
	public boolean method4756(@OriginalArg(0) int arg0, @OriginalArg(1) Class116 arg1) {
		if (this.anInt5407 == 0) {
			return false;
		} else {
			this.aClass44Array1[this.anInt5407 & Integer.MAX_VALUE].method7667(arg0, arg1);
			return true;
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IZZBII)V")
	public void method4759(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(5) boolean local5 = arg2 & this.aClass33_Sub3_19.method8127();
		if (!local5 && (arg4 == 4 || arg4 == 8 || arg4 == 9)) {
			if (arg4 == 4) {
				arg0 = arg3;
			}
			arg4 = 2;
		}
		if (arg4 != 0 && arg1) {
			arg4 |= Integer.MIN_VALUE;
		}
		if (arg4 != this.anInt5407) {
			if (this.anInt5407 != 0) {
				this.aClass44Array1[this.anInt5407 & Integer.MAX_VALUE].method7672();
			}
			if (arg4 != 0) {
				this.aClass44Array1[Integer.MAX_VALUE & arg4].method7670(arg1);
				this.aClass44Array1[Integer.MAX_VALUE & arg4].method7671(arg1);
				this.aClass44Array1[Integer.MAX_VALUE & arg4].method7668(arg3, arg0);
			}
			this.anInt5404 = arg0;
			this.anInt5407 = arg4;
			this.anInt5406 = arg3;
		} else if (this.anInt5407 != 0) {
			this.aClass44Array1[Integer.MAX_VALUE & this.anInt5407].method7671(arg1);
			if (this.anInt5406 != arg3 || this.anInt5404 != arg0) {
				this.aClass44Array1[Integer.MAX_VALUE & this.anInt5407].method7668(arg3, arg0);
				this.anInt5406 = arg3;
				this.anInt5404 = arg0;
			}
		}
	}
}
