import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ar")
public final class Class25 {

	@OriginalMember(owner = "client!ar", name = "e", descriptor = "[J")
	public static final long[] aLongArray1 = new long[256];

	@OriginalMember(owner = "client!ar", name = "i", descriptor = "J")
	private long aLong12;

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "I")
	private int anInt345 = -1;

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "Lclient!fca;")
	private final Class114 aClass114_3 = new Class114();

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(8) long local8 = (long) local4;
			for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
				if ((local8 & 0x1L) == 1L) {
					local8 = local8 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local8 >>>= 0x1;
				}
			}
			aLongArray1[local4] = local8;
		}
	}

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lclient!mc;)V")
	public Class25(@OriginalArg(0) Class5_Sub41 arg0) {
		this.method314(arg0);
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(BLclient!im;)V")
	public void method313(@OriginalArg(1) Class166 arg0) {
		if (this.aLong12 != arg0.aLong121 || this.anInt345 != arg0.anInt4863) {
			throw new RuntimeException("ClanSettingsDelta.applyToClanSettings(): Credentials do not match! Settings.owner:" + Static142.method2492(arg0.aLong121) + " updateNum:" + arg0.anInt4863 + " delta.owner:" + Static142.method2492(this.aLong12) + " updateNum:" + this.anInt345);
		}
		for (@Pc(59) Class5_Sub1 local59 = (Class5_Sub1) this.aClass114_3.method2805(); local59 != null; local59 = (Class5_Sub1) this.aClass114_3.method2814()) {
			local59.method8505(arg0);
		}
		arg0.anInt4863++;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(BLclient!mc;)V")
	private void method314(@OriginalArg(1) Class5_Sub41 arg0) {
		this.aLong12 = arg0.method7823();
		this.anInt345 = arg0.method7804();
		for (@Pc(24) int local24 = arg0.method7816(); local24 != 0; local24 = arg0.method7816()) {
			if (Static118.aBoolean228) {
				System.out.println("t:" + local24);
			}
			@Pc(44) Class5_Sub1 local44;
			if (local24 == 3) {
				local44 = new Class5_Sub1_Sub5();
			} else if (local24 == 1) {
				local44 = new Class5_Sub1_Sub7();
			} else if (local24 == 4) {
				local44 = new Class5_Sub1_Sub9();
			} else if (local24 == 6) {
				local44 = new Class5_Sub1_Sub1();
			} else if (local24 == 5) {
				local44 = new Class5_Sub1_Sub3();
			} else if (local24 == 2) {
				local44 = new Class5_Sub1_Sub6();
			} else if (local24 == 7) {
				local44 = new Class5_Sub1_Sub2();
			} else if (local24 == 8) {
				local44 = new Class5_Sub1_Sub8();
			} else if (local24 == 9) {
				local44 = new Class5_Sub1_Sub11();
			} else if (local24 == 10) {
				local44 = new Class5_Sub1_Sub10();
			} else if (local24 == 11) {
				local44 = new Class5_Sub1_Sub12();
			} else if (local24 == 12) {
				local44 = new Class5_Sub1_Sub4();
			} else {
				throw new RuntimeException("Unrecognised ClanSettingsDelta type in decode()");
			}
			local44.method8507(arg0);
			this.aClass114_3.method2807(local44);
		}
	}
}
