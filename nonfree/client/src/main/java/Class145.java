import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class145 {

	@OriginalMember(owner = "client!ie", name = "A", descriptor = "I")
	public int anInt4300;

	@OriginalMember(owner = "client!ie", name = "h", descriptor = "Lclient!aj;")
	private final Class10 aClass10_18 = new Class10(64);

	@OriginalMember(owner = "client!ie", name = "v", descriptor = "Lclient!aj;")
	public final Class10 aClass10_19 = new Class10(50);

	@OriginalMember(owner = "client!ie", name = "w", descriptor = "Lclient!tb;")
	public final Class316 aClass316_1 = new Class316(250);

	@OriginalMember(owner = "client!ie", name = "x", descriptor = "Lclient!hr;")
	private final Class136 aClass136_1 = new Class136();

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
	public final int anInt4289;

	@OriginalMember(owner = "client!ie", name = "p", descriptor = "Z")
	private boolean aBoolean327;

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "Lclient!om;")
	private final Class246 aClass246_108;

	@OriginalMember(owner = "client!ie", name = "k", descriptor = "Lclient!om;")
	public final Class246 aClass246_109;

	@OriginalMember(owner = "client!ie", name = "y", descriptor = "Lclient!gm;")
	private final Class118 aClass118_2;

	@OriginalMember(owner = "client!ie", name = "n", descriptor = "I")
	public final int anInt4294;

	@OriginalMember(owner = "client!ie", name = "z", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray28;

	@OriginalMember(owner = "client!ie", name = "B", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray29;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lclient!mea;IZLclient!gm;Lclient!om;Lclient!om;)V")
	public Class145(@OriginalArg(0) Class211 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class118 arg3, @OriginalArg(4) Class246 arg4, @OriginalArg(5) Class246 arg5) {
		this.anInt4289 = arg1;
		this.aBoolean327 = arg2;
		this.aClass246_108 = arg4;
		this.aClass246_109 = arg5;
		this.aClass118_2 = arg3;
		if (this.aClass246_108 == null) {
			this.anInt4294 = 0;
		} else {
			@Pc(49) int local49 = this.aClass246_108.method5682() - 1;
			this.anInt4294 = local49 * 256 + this.aClass246_108.method5673(local49);
		}
		this.aStringArray28 = new String[] { null, null, Static48.aClass33_9.method797(this.anInt4289), null, null };
		this.aStringArray29 = new String[] { null, null, null, null, Static48.aClass33_10.method797(this.anInt4289) };
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V")
	public void method3788() {
		@Pc(2) Class10 local2 = this.aClass10_18;
		synchronized (this.aClass10_18) {
			this.aClass10_18.method263();
		}
		local2 = this.aClass10_19;
		synchronized (this.aClass10_19) {
			this.aClass10_19.method263();
		}
		@Pc(36) Class316 local36 = this.aClass316_1;
		synchronized (this.aClass316_1) {
			this.aClass316_1.method6709();
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V")
	public void method3789() {
		@Pc(2) Class10 local2 = this.aClass10_18;
		synchronized (this.aClass10_18) {
			this.aClass10_18.method262();
		}
		local2 = this.aClass10_19;
		synchronized (this.aClass10_19) {
			this.aClass10_19.method262();
		}
		@Pc(40) Class316 local40 = this.aClass316_1;
		synchronized (this.aClass316_1) {
			this.aClass316_1.method6710();
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IB)V")
	public void method3790(@OriginalArg(0) int arg0) {
		this.anInt4300 = arg0;
		@Pc(17) Class10 local17 = this.aClass10_19;
		synchronized (this.aClass10_19) {
			this.aClass10_19.method263();
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZZ)V")
	public void method3792(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean327 != arg0) {
			this.aBoolean327 = arg0;
			this.method3788();
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZILclient!r;Lclient!efa;III)Lclient!f;")
	public Class46 method3793(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class43 arg2, @OriginalArg(4) Class75 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.aClass136_1.anInt4128 = arg2.anInt8539;
		this.aClass136_1.aBoolean322 = arg3 != null;
		this.aClass136_1.anInt4123 = arg5;
		this.aClass136_1.anInt4127 = arg4;
		this.aClass136_1.anInt4129 = arg6;
		this.aClass136_1.anInt4122 = arg1;
		this.aClass136_1.anInt4131 = arg0;
		return (Class46) this.aClass316_1.method6715(this.aClass136_1);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)V")
	public void method3794() {
		@Pc(10) Class10 local10 = this.aClass10_18;
		synchronized (this.aClass10_18) {
			this.aClass10_18.method258(5);
		}
		local10 = this.aClass10_19;
		synchronized (this.aClass10_19) {
			this.aClass10_19.method258(5);
		}
		@Pc(42) Class316 local42 = this.aClass316_1;
		synchronized (this.aClass316_1) {
			this.aClass316_1.method6713();
		}
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)V")
	public void method3795() {
		@Pc(8) Class10 local8 = this.aClass10_19;
		synchronized (this.aClass10_19) {
			this.aClass10_19.method263();
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIBLclient!efa;ILclient!r;Lclient!la;IZZILclient!r;)Lclient!f;")
	public Class46 method3796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class75 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class43 arg4, @OriginalArg(6) Class117 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class43 arg10) {
		@Pc(16) Class46 local16 = this.method3793(arg3, arg9, arg10, arg2, arg1, arg6, arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class339 local30 = this.method3798(arg0);
		if (arg3 > 1 && local30.anIntArray645 != null) {
			@Pc(40) int local40 = -1;
			for (@Pc(42) int local42 = 0; local42 < 10; local42++) {
				if (arg3 >= local30.anIntArray647[local42] && local30.anIntArray647[local42] != 0) {
					local40 = local30.anIntArray645[local42];
				}
			}
			if (local40 != -1) {
				local30 = this.method3798(local40);
			}
		}
		@Pc(93) int[] local93 = local30.method7318(arg1, arg5, arg2, arg3, arg4, arg6, arg10, arg8, arg9);
		if (local93 == null) {
			return null;
		}
		@Pc(107) Class46 local107;
		if (arg7) {
			local107 = arg4.method7198(local93, 36, 36, 32);
		} else {
			local107 = arg10.method7198(local93, 36, 36, 32);
		}
		if (!arg7) {
			@Pc(123) Class136 local123 = new Class136();
			local123.anInt4131 = arg3;
			local123.anInt4122 = arg9;
			local123.anInt4127 = arg1;
			local123.anInt4128 = arg10.anInt8539;
			local123.anInt4123 = arg6;
			local123.aBoolean322 = arg2 != null;
			local123.anInt4129 = arg0;
			this.aClass316_1.method6716(local123, local107);
		}
		return local107;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)V")
	public void method3797() {
		@Pc(2) Class316 local2 = this.aClass316_1;
		synchronized (this.aClass316_1) {
			this.aClass316_1.method6709();
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(IB)Lclient!ut;")
	public Class339 method3798(@OriginalArg(0) int arg0) {
		@Pc(8) Class10 local8 = this.aClass10_18;
		@Pc(18) Class339 local18;
		synchronized (this.aClass10_18) {
			local18 = (Class339) this.aClass10_18.method250((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class246 local31 = this.aClass246_108;
		@Pc(44) byte[] local44;
		synchronized (this.aClass246_108) {
			local44 = this.aClass246_108.method5653(Static397.method5823(arg0), Static542.method7129(arg0));
		}
		local18 = new Class339();
		local18.anInt8845 = arg0;
		local18.aClass145_2 = this;
		local18.aStringArray45 = new String[] { null, null, Static48.aClass33_9.method797(this.anInt4289), null, null };
		local18.aStringArray44 = new String[] { null, null, null, null, Static48.aClass33_10.method797(this.anInt4289) };
		if (local44 != null) {
			local18.method7307(new Class3_Sub11(local44));
		}
		local18.method7321();
		if (local18.anInt8830 != -1) {
			local18.method7322(this.method3798(local18.anInt8830), this.method3798(local18.anInt8802));
		}
		if (local18.anInt8821 != -1) {
			local18.method7317(this.method3798(local18.anInt8820), this.method3798(local18.anInt8821));
		}
		if (!this.aBoolean327 && local18.aBoolean692) {
			local18.aString120 = Static48.aClass33_7.method797(this.anInt4289);
			local18.aStringArray45 = this.aStringArray28;
			local18.anIntArray646 = null;
			local18.aBoolean693 = false;
			local18.anInt8822 = 0;
			local18.aStringArray44 = this.aStringArray29;
			if (local18.aClass310_39 != null) {
				@Pc(204) boolean local204 = false;
				for (@Pc(209) Class3 local209 = local18.aClass310_39.method6602(); local209 != null; local209 = local18.aClass310_39.method6599()) {
					@Pc(219) Class14 local219 = this.aClass118_2.method3019((int) local209.aLong273);
					if (local219.aBoolean43) {
						local209.method7812();
					} else {
						local204 = true;
					}
				}
				if (!local204) {
					local18.aClass310_39 = null;
				}
			}
		}
		@Pc(246) Class10 local246 = this.aClass10_18;
		synchronized (this.aClass10_18) {
			this.aClass10_18.method254(local18, (long) arg0);
			return local18;
		}
	}
}
