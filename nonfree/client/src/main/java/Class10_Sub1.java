import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!an")
public final class Class10_Sub1 extends Class10 {

	@OriginalMember(owner = "client!an", name = "u", descriptor = "I")
	public int anInt282;

	@OriginalMember(owner = "client!an", name = "w", descriptor = "I")
	public int anInt283;

	@OriginalMember(owner = "client!an", name = "x", descriptor = "I")
	public int anInt284;

	@OriginalMember(owner = "client!an", name = "z", descriptor = "I")
	public int anInt285;

	@OriginalMember(owner = "client!an", name = "A", descriptor = "I")
	public int anInt286;

	@OriginalMember(owner = "client!an", name = "i", descriptor = "Z")
	public boolean aBoolean27 = false;

	@OriginalMember(owner = "client!an", name = "o", descriptor = "I")
	public int anInt279 = 0;

	@OriginalMember(owner = "client!an", name = "p", descriptor = "Z")
	private boolean aBoolean28 = false;

	@OriginalMember(owner = "client!an", name = "k", descriptor = "Lclient!mb;")
	private Class154 aClass154_1 = new Class154();

	@OriginalMember(owner = "client!an", name = "q", descriptor = "I")
	private int anInt280 = 0;

	@OriginalMember(owner = "client!an", name = "r", descriptor = "Lclient!cf;")
	public Class30 aClass30_3 = new Class30();

	@OriginalMember(owner = "client!an", name = "v", descriptor = "Z")
	private boolean aBoolean29 = false;

	@OriginalMember(owner = "client!an", name = "t", descriptor = "I")
	private int anInt281 = 0;

	@OriginalMember(owner = "client!an", name = "y", descriptor = "Lclient!pa;")
	public final Class186 aClass186_1 = new Class186();

	@OriginalMember(owner = "client!an", name = "n", descriptor = "[Lclient!si;")
	public Class10_Sub8_Sub1_Sub1[] aClass10_Sub8_Sub1_Sub1Array1 = new Class10_Sub8_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!an", name = "j", descriptor = "J")
	private long aLong12;

	@OriginalMember(owner = "client!an", name = "m", descriptor = "J")
	private long aLong13;

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(I)V")
	public Class10_Sub1(@OriginalArg(0) int arg0) {
		Static71.aClass154_2.method3481(this);
		this.aLong12 = arg0;
		this.aLong13 = arg0;
		this.aBoolean29 = true;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(J)V")
	public void method222(@OriginalArg(0) long arg0) {
		this.aLong12 = arg0;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!vc;[Lclient!of;Z)V")
	private void method223(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class176[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static11.aBooleanArray3[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class10_Sub5 local16 = (Class10_Sub5) this.aClass154_1.method3479(); local16 != null; local16 = (Class10_Sub5) this.aClass154_1.method3483()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass176_1 == arg1[local21] || local16.aClass176_1 == arg1[local21].aClass176_2) {
						Static11.aBooleanArray3[local21] = true;
						local16.method2833();
						local16.aBoolean227 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt3018 == 0) {
				local16.method4605();
				this.anInt280--;
			} else {
				local16.aBoolean227 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt280 != 8; local21++) {
			if (!Static11.aBooleanArray3[local21]) {
				@Pc(101) Class10_Sub5 local101 = new Class10_Sub5(arg0, arg1[local21], this, this.aLong12);
				this.aClass154_1.method3481(local101);
				this.anInt280++;
				Static11.aBooleanArray3[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!vc;J[Lclient!of;[Lclient!lh;Z)V")
	public void method224(@OriginalArg(0) Class63 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class176[] arg2, @OriginalArg(3) Class145[] arg3) {
		if (!this.aBoolean27) {
			this.method223(arg0, arg2);
			this.method234(arg3);
			this.aLong12 = arg1;
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "()V")
	private void method225() {
		this.aBoolean28 = false;
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "()V")
	public void method226() {
		this.aBoolean28 = true;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIII)V")
	public void method228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt286 = arg0;
		this.anInt284 = arg1;
		this.anInt285 = arg2;
		this.anInt283 = arg3;
		this.anInt282 = arg4;
	}

	@OriginalMember(owner = "client!an", name = "d", descriptor = "()Lclient!pa;")
	public Class186 method229() {
		return this.aClass186_1;
	}

	@OriginalMember(owner = "client!an", name = "e", descriptor = "()V")
	public void method230() {
		this.aClass186_1.aClass148_1.method3325();
		for (@Pc(10) Class10_Sub5 local10 = (Class10_Sub5) this.aClass154_1.method3479(); local10 != null; local10 = (Class10_Sub5) this.aClass154_1.method3483()) {
			local10.method2836(this.aLong13);
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!vc;J)Z")
	public boolean method231(@OriginalArg(0) Class63 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong12 == this.aLong13) {
			this.method225();
		} else {
			this.method226();
		}
		if (arg1 - this.aLong12 > 750L) {
			this.method233();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong13);
		@Pc(36) Class10_Sub5 local36;
		if (this.aBoolean29) {
			for (local36 = (Class10_Sub5) this.aClass154_1.method3479(); local36 != null; local36 = (Class10_Sub5) this.aClass154_1.method3483()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass120_1.anInt3089; local39++) {
					local36.method2837(arg0, arg1, 1, !this.aBoolean28);
				}
			}
			this.aBoolean29 = false;
		}
		for (local36 = (Class10_Sub5) this.aClass154_1.method3479(); local36 != null; local36 = (Class10_Sub5) this.aClass154_1.method3483()) {
			local36.method2837(arg0, arg1, local27, !this.aBoolean28);
		}
		this.aLong13 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!an", name = "f", descriptor = "()V")
	public void method232() {
		this.aBoolean29 = true;
	}

	@OriginalMember(owner = "client!an", name = "g", descriptor = "()V")
	public void method233() {
		this.aBoolean27 = true;
		for (@Pc(8) Class2_Sub10_Sub7 local8 = (Class2_Sub10_Sub7) this.aClass30_3.method694(); local8 != null; local8 = (Class2_Sub10_Sub7) this.aClass30_3.method682()) {
			if (local8.aClass41_1.anInt1047 == 1) {
				local8.method5572();
			}
		}
		this.aClass10_Sub8_Sub1_Sub1Array1 = new Class10_Sub8_Sub1_Sub1[8192];
		this.anInt279 = 0;
		this.aClass154_1 = new Class154();
		this.anInt280 = 0;
		this.aClass30_3 = new Class30();
		this.anInt281 = 0;
		this.method4605();
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "([Lclient!lh;Z)V")
	private void method234(@OriginalArg(0) Class145[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static11.aBooleanArray2[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class2_Sub10_Sub7 local16 = (Class2_Sub10_Sub7) this.aClass30_3.method694(); local16 != null; local16 = (Class2_Sub10_Sub7) this.aClass30_3.method682()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass145_1 == arg0[local21] || local16.aClass145_1 == arg0[local21].aClass145_2) {
						Static11.aBooleanArray2[local21] = true;
						local16.method1685();
						continue label68;
					}
				}
			}
			local16.method5617();
			this.anInt281--;
			if (local16.method5573()) {
				local16.method5572();
				Static341.anInt5824--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt281 != 8; local21++) {
			if (!Static11.aBooleanArray2[local21]) {
				@Pc(93) Class2_Sub10_Sub7 local93 = null;
				if (Static141.method2668(arg0[local21].anInt3634).anInt1047 == 1 && Static341.anInt5824 < 32) {
					local93 = new Class2_Sub10_Sub7(arg0[local21], this);
					Static146.aClass164_1.method3636((long) arg0[local21].anInt3634, local93);
					Static341.anInt5824++;
				}
				if (local93 == null) {
					local93 = new Class2_Sub10_Sub7(arg0[local21], this);
				}
				this.aClass30_3.method685(local93);
				this.anInt281++;
				Static11.aBooleanArray2[local21] = true;
			}
		}
	}
}
