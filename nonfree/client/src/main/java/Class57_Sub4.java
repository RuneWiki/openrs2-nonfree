import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class Class57_Sub4 extends Class57 {

	@OriginalMember(owner = "client!ko", name = "u", descriptor = "I")
	public int anInt3932;

	@OriginalMember(owner = "client!ko", name = "w", descriptor = "I")
	public int anInt3934;

	@OriginalMember(owner = "client!ko", name = "y", descriptor = "I")
	public int anInt3935;

	@OriginalMember(owner = "client!ko", name = "A", descriptor = "I")
	public int anInt3936;

	@OriginalMember(owner = "client!ko", name = "B", descriptor = "I")
	public int anInt3937;

	@OriginalMember(owner = "client!ko", name = "o", descriptor = "I")
	public int anInt3930 = 0;

	@OriginalMember(owner = "client!ko", name = "n", descriptor = "Z")
	private boolean aBoolean263 = false;

	@OriginalMember(owner = "client!ko", name = "m", descriptor = "Z")
	public boolean aBoolean262 = false;

	@OriginalMember(owner = "client!ko", name = "j", descriptor = "Lclient!i;")
	private Class111 aClass111_2 = new Class111();

	@OriginalMember(owner = "client!ko", name = "s", descriptor = "I")
	private int anInt3931 = 0;

	@OriginalMember(owner = "client!ko", name = "t", descriptor = "Lclient!um;")
	public Class244 aClass244_18 = new Class244();

	@OriginalMember(owner = "client!ko", name = "v", descriptor = "I")
	private int anInt3933 = 0;

	@OriginalMember(owner = "client!ko", name = "z", descriptor = "Z")
	private boolean aBoolean264 = false;

	@OriginalMember(owner = "client!ko", name = "x", descriptor = "Lclient!bv;")
	public final Class32 aClass32_2 = new Class32();

	@OriginalMember(owner = "client!ko", name = "k", descriptor = "[Lclient!om;")
	public Class57_Sub1_Sub1_Sub1[] aClass57_Sub1_Sub1_Sub1Array2 = new Class57_Sub1_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!ko", name = "l", descriptor = "J")
	private long aLong118;

	@OriginalMember(owner = "client!ko", name = "q", descriptor = "J")
	private long aLong119;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(I)V")
	public Class57_Sub4(@OriginalArg(0) int arg0) {
		Static4.aClass111_9.method2696(this);
		this.aLong118 = arg0;
		this.aLong119 = arg0;
		this.aBoolean264 = true;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "()V")
	public void method3246() {
		this.aClass32_2.aClass177_1.method4205();
		for (@Pc(10) Class57_Sub8 local10 = (Class57_Sub8) this.aClass111_2.method2688(); local10 != null; local10 = (Class57_Sub8) this.aClass111_2.method2690()) {
			local10.method5360(this.aLong119);
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!eq;[Lclient!in;Z)V")
	private void method3247(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class119[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static216.aBooleanArray13[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class57_Sub8 local16 = (Class57_Sub8) this.aClass111_2.method2688(); local16 != null; local16 = (Class57_Sub8) this.aClass111_2.method2690()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass119_2 == arg1[local21] || local16.aClass119_2 == arg1[local21].aClass119_1) {
						Static216.aBooleanArray13[local21] = true;
						local16.method5362();
						local16.aBoolean409 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt6472 == 0) {
				local16.method5359();
				this.anInt3931--;
			} else {
				local16.aBoolean409 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt3931 != 8; local21++) {
			if (!Static216.aBooleanArray13[local21]) {
				@Pc(101) Class57_Sub8 local101 = new Class57_Sub8(arg0, arg1[local21], this, this.aLong118);
				this.aClass111_2.method2696(local101);
				this.anInt3931++;
				Static216.aBooleanArray13[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!eq;J[Lclient!in;[Lclient!gq;Z)V")
	public void method3248(@OriginalArg(0) Class66 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class119[] arg2, @OriginalArg(3) Class94[] arg3) {
		if (!this.aBoolean262) {
			this.method3247(arg0, arg2);
			this.method3257(arg3);
			this.aLong118 = arg1;
		}
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "()V")
	public void method3249() {
		this.aBoolean264 = true;
	}

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "()Lclient!bv;")
	public Class32 method3250() {
		return this.aClass32_2;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(J)V")
	public void method3251(@OriginalArg(0) long arg0) {
		this.aLong118 = arg0;
	}

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "()V")
	public void method3252() {
		this.aBoolean263 = true;
	}

	@OriginalMember(owner = "client!ko", name = "f", descriptor = "()V")
	public void method3254() {
		this.aBoolean262 = true;
		for (@Pc(8) Class6_Sub2_Sub6 local8 = (Class6_Sub2_Sub6) this.aClass244_18.method5976(); local8 != null; local8 = (Class6_Sub2_Sub6) this.aClass244_18.method5964()) {
			if (local8.aClass49_1.anInt1828 == 1) {
				local8.method6373();
			}
		}
		this.aClass57_Sub1_Sub1_Sub1Array2 = new Class57_Sub1_Sub1_Sub1[8192];
		this.anInt3930 = 0;
		this.aClass111_2 = new Class111();
		this.anInt3931 = 0;
		this.aClass244_18 = new Class244();
		this.anInt3933 = 0;
		this.method5359();
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIII)V")
	public void method3255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt3934 = arg0;
		this.anInt3936 = arg1;
		this.anInt3937 = arg2;
		this.anInt3932 = arg3;
		this.anInt3935 = arg4;
	}

	@OriginalMember(owner = "client!ko", name = "g", descriptor = "()V")
	private void method3256() {
		this.aBoolean263 = false;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "([Lclient!gq;Z)V")
	private void method3257(@OriginalArg(0) Class94[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static216.aBooleanArray12[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class6_Sub2_Sub6 local16 = (Class6_Sub2_Sub6) this.aClass244_18.method5976(); local16 != null; local16 = (Class6_Sub2_Sub6) this.aClass244_18.method5964()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass94_2 == arg0[local21] || local16.aClass94_2 == arg0[local21].aClass94_1) {
						Static216.aBooleanArray12[local21] = true;
						local16.method3042();
						continue label68;
					}
				}
			}
			local16.method6525();
			this.anInt3933--;
			if (local16.method6371()) {
				local16.method6373();
				Static248.anInt7513--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt3933 != 8; local21++) {
			if (!Static216.aBooleanArray12[local21]) {
				@Pc(93) Class6_Sub2_Sub6 local93 = null;
				if (arg0[local21].method2406().anInt1828 == 1 && Static248.anInt7513 < 32) {
					local93 = new Class6_Sub2_Sub6(arg0[local21], this);
					Static431.aClass102_1.method2606((long) arg0[local21].anInt2879, local93);
					Static248.anInt7513++;
				}
				if (local93 == null) {
					local93 = new Class6_Sub2_Sub6(arg0[local21], this);
				}
				this.aClass244_18.method5966(local93);
				this.anInt3933++;
				Static216.aBooleanArray12[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!eq;J)Z")
	public boolean method3258(@OriginalArg(0) Class66 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong118 == this.aLong119) {
			this.method3256();
		} else {
			this.method3252();
		}
		if (arg1 - this.aLong118 > 750L) {
			this.method3254();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong119);
		@Pc(36) Class57_Sub8 local36;
		if (this.aBoolean264) {
			for (local36 = (Class57_Sub8) this.aClass111_2.method2688(); local36 != null; local36 = (Class57_Sub8) this.aClass111_2.method2690()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass188_1.anInt5241; local39++) {
					local36.method5364(arg0, !this.aBoolean263, 1, arg1);
				}
			}
			this.aBoolean264 = false;
		}
		for (local36 = (Class57_Sub8) this.aClass111_2.method2688(); local36 != null; local36 = (Class57_Sub8) this.aClass111_2.method2690()) {
			local36.method5364(arg0, !this.aBoolean263, local27, arg1);
		}
		this.aLong119 = arg1;
		return true;
	}
}
