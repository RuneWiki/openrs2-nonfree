import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iu")
public final class Class25_Sub7 extends Class25 {

	@OriginalMember(owner = "client!iu", name = "m", descriptor = "J")
	private long aLong110;

	@OriginalMember(owner = "client!iu", name = "q", descriptor = "J")
	private long aLong111;

	@OriginalMember(owner = "client!iu", name = "w", descriptor = "I")
	public int anInt4727;

	@OriginalMember(owner = "client!iu", name = "k", descriptor = "Z")
	public boolean aBoolean304 = false;

	@OriginalMember(owner = "client!iu", name = "l", descriptor = "Z")
	private boolean aBoolean305 = false;

	@OriginalMember(owner = "client!iu", name = "p", descriptor = "I")
	public int anInt4724 = 0;

	@OriginalMember(owner = "client!iu", name = "n", descriptor = "Lclient!qe;")
	private Class269 aClass269_4 = new Class269();

	@OriginalMember(owner = "client!iu", name = "s", descriptor = "I")
	private int anInt4725 = 0;

	@OriginalMember(owner = "client!iu", name = "r", descriptor = "Lclient!or;")
	public Class244 aClass244_39 = new Class244();

	@OriginalMember(owner = "client!iu", name = "u", descriptor = "Z")
	private boolean aBoolean307 = false;

	@OriginalMember(owner = "client!iu", name = "t", descriptor = "Z")
	public boolean aBoolean306 = false;

	@OriginalMember(owner = "client!iu", name = "v", descriptor = "I")
	private int anInt4726 = 0;

	@OriginalMember(owner = "client!iu", name = "x", descriptor = "Lclient!tt;")
	public final Class323 aClass323_1 = new Class323();

	@OriginalMember(owner = "client!iu", name = "o", descriptor = "[Lclient!tn;")
	public final Class25_Sub5_Sub1_Sub1[] aClass25_Sub5_Sub1_Sub1Array1 = new Class25_Sub5_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(IZ)V")
	public Class25_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method3779(arg0, arg1);
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "()V")
	public void method3773() {
		this.aBoolean304 = true;
		for (@Pc(8) Class3_Sub7_Sub16 local8 = (Class3_Sub7_Sub16) this.aClass244_39.method5572(); local8 != null; local8 = (Class3_Sub7_Sub16) this.aClass244_39.method5576()) {
			if (local8.aClass205_1.anInt6012 == 1) {
				local8.method8136();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass25_Sub5_Sub1_Sub1Array1.length; local27++) {
			if (this.aClass25_Sub5_Sub1_Sub1Array1[local27] != null) {
				this.aClass25_Sub5_Sub1_Sub1Array1[local27].method6967();
				this.aClass25_Sub5_Sub1_Sub1Array1[local27] = null;
			}
		}
		this.anInt4724 = 0;
		this.aClass269_4 = new Class269();
		this.anInt4725 = 0;
		this.aClass244_39 = new Class244();
		this.anInt4726 = 0;
		this.method6959();
		Static541.aClass25_Sub7Array1[Static520.anInt9166] = this;
		Static520.anInt9166 = Static520.anInt9166 + 1 & Static357.anIntArray353[Static80.anInt2134];
	}

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "()V")
	private void method3774() {
		this.aBoolean305 = false;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "([Lclient!rea;Z)V")
	private void method3775(@OriginalArg(0) Class280[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static236.aBooleanArray14[local1] = false;
		}
		@Pc(21) int local21;
		label71: for (@Pc(16) Class3_Sub7_Sub16 local16 = (Class3_Sub7_Sub16) this.aClass244_39.method5572(); local16 != null; local16 = (Class3_Sub7_Sub16) this.aClass244_39.method5576()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass280_1 == arg0[local21] || local16.aClass280_1 == arg0[local21].aClass280_2) {
						Static236.aBooleanArray14[local21] = true;
						local16.method5788();
						continue label71;
					}
				}
			}
			local16.method8128();
			this.anInt4726--;
			if (local16.method8131()) {
				local16.method8136();
				Static99.anInt2421--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && local21 != 8 && this.anInt4726 != 8; local21++) {
			if (!Static236.aBooleanArray14[local21]) {
				@Pc(96) Class3_Sub7_Sub16 local96 = null;
				if (arg0[local21].method6283().anInt6012 == 1 && Static99.anInt2421 < 32) {
					local96 = new Class3_Sub7_Sub16(arg0[local21], this);
					Static410.aClass139_1.method3675(local96, (long) arg0[local21].anInt7969);
					Static99.anInt2421++;
				}
				if (local96 == null) {
					local96 = new Class3_Sub7_Sub16(arg0[local21], this);
				}
				this.aClass244_39.method5570(local96);
				this.anInt4726++;
				Static236.aBooleanArray14[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!iu", name = "c", descriptor = "()Lclient!tt;")
	public Class323 method3777() {
		return this.aClass323_1;
	}

	@OriginalMember(owner = "client!iu", name = "d", descriptor = "()V")
	public void method3778() {
		this.aBoolean305 = true;
	}

	@OriginalMember(owner = "client!iu", name = "c", descriptor = "(IZ)V")
	public void method3779(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static344.aClass269_5.method5977(this);
		this.aLong111 = arg0;
		this.aLong110 = arg0;
		this.aBoolean307 = true;
		this.aBoolean306 = arg1;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lclient!r;)V")
	public void method3780(@OriginalArg(0) Class31 arg0) {
		this.aClass323_1.aClass114_1.method3063();
		for (@Pc(10) Class25_Sub6 local10 = (Class25_Sub6) this.aClass269_4.method5974(); local10 != null; local10 = (Class25_Sub6) this.aClass269_4.method5979()) {
			local10.method3718(this.aLong110, arg0);
		}
	}

	@OriginalMember(owner = "client!iu", name = "e", descriptor = "()Lclient!tt;")
	public Class323 method3781() {
		this.aClass323_1.aClass114_1.method3063();
		for (@Pc(6) int local6 = 0; local6 < this.aClass25_Sub5_Sub1_Sub1Array1.length; local6++) {
			if (this.aClass25_Sub5_Sub1_Sub1Array1[local6] != null && this.aClass25_Sub5_Sub1_Sub1Array1[local6].aClass25_Sub6_1 != null) {
				this.aClass323_1.aClass114_1.method3064(this.aClass25_Sub5_Sub1_Sub1Array1[local6]);
			}
		}
		return this.aClass323_1;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lclient!r;J)Z")
	public boolean method3783(@OriginalArg(0) Class31 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong111 == this.aLong110) {
			this.method3774();
		} else {
			this.method3778();
		}
		if (arg1 - this.aLong111 > 750L) {
			this.method3773();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong110);
		@Pc(36) Class25_Sub6 local36;
		if (this.aBoolean307) {
			for (local36 = (Class25_Sub6) this.aClass269_4.method5974(); local36 != null; local36 = (Class25_Sub6) this.aClass269_4.method5979()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass358_1.anInt10177; local39++) {
					local36.method3716(1, arg1, arg0, !this.aBoolean305);
				}
			}
			this.aBoolean307 = false;
		}
		for (local36 = (Class25_Sub6) this.aClass269_4.method5974(); local36 != null; local36 = (Class25_Sub6) this.aClass269_4.method5979()) {
			local36.method3716(local27, arg1, arg0, !this.aBoolean305);
		}
		this.aLong110 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lclient!r;J[Lclient!ti;[Lclient!rea;Z)V")
	public void method3784(@OriginalArg(0) Class31 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class317[] arg2, @OriginalArg(3) Class280[] arg3) {
		if (!this.aBoolean304) {
			this.method3787(arg0, arg2);
			this.method3775(arg3);
			this.aLong111 = arg1;
		}
	}

	@OriginalMember(owner = "client!iu", name = "g", descriptor = "()V")
	public void method3785() {
		this.aBoolean307 = true;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIIII)V")
	public void method3786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt4727 = arg0;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lclient!r;[Lclient!ti;Z)V")
	private void method3787(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class317[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 32; local1++) {
			Static236.aBooleanArray13[local1] = false;
		}
		@Pc(21) int local21;
		label62: for (@Pc(16) Class25_Sub6 local16 = (Class25_Sub6) this.aClass269_4.method5974(); local16 != null; local16 = (Class25_Sub6) this.aClass269_4.method5979()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass317_1 == arg1[local21] || local16.aClass317_1 == arg1[local21].aClass317_2) {
						Static236.aBooleanArray13[local21] = true;
						local16.method3715();
						local16.aBoolean297 = false;
						continue label62;
					}
				}
			}
			if (local16.anInt4630 == 0) {
				local16.method6959();
				this.anInt4725--;
			} else {
				local16.aBoolean297 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && local21 != 32 && this.anInt4725 != 32; local21++) {
			if (!Static236.aBooleanArray13[local21]) {
				@Pc(104) Class25_Sub6 local104 = new Class25_Sub6(arg0, arg1[local21], this, this.aLong111);
				this.aClass269_4.method5977(local104);
				this.anInt4725++;
				Static236.aBooleanArray13[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(J)V")
	public void method3788(@OriginalArg(0) long arg0) {
		this.aLong111 = arg0;
	}
}
