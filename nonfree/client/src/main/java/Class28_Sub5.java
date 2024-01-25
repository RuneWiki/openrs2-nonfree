import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nia")
public final class Class28_Sub5 extends Class28 {

	@OriginalMember(owner = "client!nia", name = "j", descriptor = "J")
	private long aLong182;

	@OriginalMember(owner = "client!nia", name = "n", descriptor = "J")
	private long aLong183;

	@OriginalMember(owner = "client!nia", name = "s", descriptor = "I")
	public int anInt7060;

	@OriginalMember(owner = "client!nia", name = "g", descriptor = "Z")
	public boolean aBoolean608 = false;

	@OriginalMember(owner = "client!nia", name = "h", descriptor = "I")
	public int anInt7057 = 0;

	@OriginalMember(owner = "client!nia", name = "m", descriptor = "Z")
	private boolean aBoolean609 = false;

	@OriginalMember(owner = "client!nia", name = "o", descriptor = "Lclient!hv;")
	private Class156 aClass156_5 = new Class156();

	@OriginalMember(owner = "client!nia", name = "p", descriptor = "I")
	private int anInt7058 = 0;

	@OriginalMember(owner = "client!nia", name = "q", descriptor = "Lclient!fca;")
	public Class114 aClass114_47 = new Class114();

	@OriginalMember(owner = "client!nia", name = "u", descriptor = "Z")
	public boolean aBoolean611 = false;

	@OriginalMember(owner = "client!nia", name = "t", descriptor = "Z")
	private boolean aBoolean610 = false;

	@OriginalMember(owner = "client!nia", name = "r", descriptor = "I")
	private int anInt7059 = 0;

	@OriginalMember(owner = "client!nia", name = "v", descriptor = "Lclient!wq;")
	public final Class392 aClass392_1 = new Class392();

	@OriginalMember(owner = "client!nia", name = "i", descriptor = "[Lclient!jia;")
	public final Class28_Sub3_Sub1_Sub1[] aClass28_Sub3_Sub1_Sub1Array2 = new Class28_Sub3_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!nia", name = "<init>", descriptor = "(IZ)V")
	public Class28_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method5854(arg0, arg1);
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "()V")
	public void method5844() {
		this.aBoolean610 = true;
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(IIIII)V")
	public void method5845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt7060 = arg0;
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(Lclient!ha;J)Z")
	public boolean method5846(@OriginalArg(0) Class65 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong182 == this.aLong183) {
			this.method5851();
		} else {
			this.method5858();
		}
		if (arg1 - this.aLong182 > 750L) {
			this.method5853();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong183);
		@Pc(36) Class28_Sub10 local36;
		if (this.aBoolean610) {
			for (local36 = (Class28_Sub10) this.aClass156_5.method3776(); local36 != null; local36 = (Class28_Sub10) this.aClass156_5.method3783()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass361_1.anInt10139; local39++) {
					local36.method9028(!this.aBoolean609, 1, arg1, arg0);
				}
			}
			this.aBoolean610 = false;
		}
		for (local36 = (Class28_Sub10) this.aClass156_5.method3776(); local36 != null; local36 = (Class28_Sub10) this.aClass156_5.method3783()) {
			local36.method9028(!this.aBoolean609, local27, arg1, arg0);
		}
		this.aLong183 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(J)V")
	public void method5848(@OriginalArg(0) long arg0) {
		this.aLong182 = arg0;
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "([Lclient!ld;Z)V")
	private void method5849(@OriginalArg(0) Class209[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static398.aBooleanArray31[local1] = false;
		}
		@Pc(21) int local21;
		label71: for (@Pc(16) Class5_Sub3_Sub13 local16 = (Class5_Sub3_Sub13) this.aClass114_47.method2805(); local16 != null; local16 = (Class5_Sub3_Sub13) this.aClass114_47.method2814()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass209_2 == arg0[local21] || local16.aClass209_2 == arg0[local21].aClass209_1) {
						Static398.aBooleanArray31[local21] = true;
						local16.method6497();
						continue label71;
					}
				}
			}
			local16.method9052();
			this.anInt7059--;
			if (local16.method8689()) {
				local16.method8687();
				Static575.anInt9387--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && local21 != 8 && this.anInt7059 != 8; local21++) {
			if (!Static398.aBooleanArray31[local21]) {
				@Pc(96) Class5_Sub3_Sub13 local96 = null;
				if (arg0[local21].method5131().anInt240 == 1 && Static575.anInt9387 < 32) {
					local96 = new Class5_Sub3_Sub13(arg0[local21], this);
					Static541.aClass168_1.method4122((long) arg0[local21].anInt6179, local96);
					Static575.anInt9387++;
				}
				if (local96 == null) {
					local96 = new Class5_Sub3_Sub13(arg0[local21], this);
				}
				this.aClass114_47.method2807(local96);
				this.anInt7059++;
				Static398.aBooleanArray31[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!nia", name = "c", descriptor = "()Lclient!wq;")
	public Class392 method5850() {
		this.aClass392_1.aClass307_1.method7411();
		for (@Pc(6) int local6 = 0; local6 < this.aClass28_Sub3_Sub1_Sub1Array2.length; local6++) {
			if (this.aClass28_Sub3_Sub1_Sub1Array2[local6] != null && this.aClass28_Sub3_Sub1_Sub1Array2[local6].aClass28_Sub10_1 != null) {
				this.aClass392_1.aClass307_1.method7417(this.aClass28_Sub3_Sub1_Sub1Array2[local6]);
			}
		}
		return this.aClass392_1;
	}

	@OriginalMember(owner = "client!nia", name = "d", descriptor = "()V")
	private void method5851() {
		this.aBoolean609 = false;
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(Lclient!ha;J[Lclient!sba;[Lclient!ld;Z)V")
	public void method5852(@OriginalArg(0) Class65 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class313[] arg2, @OriginalArg(3) Class209[] arg3) {
		if (!this.aBoolean608) {
			this.method5859(arg0, arg2);
			this.method5849(arg3);
			this.aLong182 = arg1;
		}
	}

	@OriginalMember(owner = "client!nia", name = "e", descriptor = "()V")
	public void method5853() {
		this.aBoolean608 = true;
		for (@Pc(8) Class5_Sub3_Sub13 local8 = (Class5_Sub3_Sub13) this.aClass114_47.method2805(); local8 != null; local8 = (Class5_Sub3_Sub13) this.aClass114_47.method2814()) {
			if (local8.aClass15_1.anInt240 == 1) {
				local8.method8687();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass28_Sub3_Sub1_Sub1Array2.length; local27++) {
			if (this.aClass28_Sub3_Sub1_Sub1Array2[local27] != null) {
				this.aClass28_Sub3_Sub1_Sub1Array2[local27].method4632();
				this.aClass28_Sub3_Sub1_Sub1Array2[local27] = null;
			}
		}
		this.anInt7057 = 0;
		this.aClass156_5 = new Class156();
		this.anInt7058 = 0;
		this.aClass114_47 = new Class114();
		this.anInt7059 = 0;
		this.method9022();
		Static529.aClass28_Sub5Array5[Static75.anInt1090] = this;
		Static75.anInt1090 = Static75.anInt1090 + 1 & Static637.anIntArray563[Static537.anInt3990];
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(IZ)V")
	public void method5854(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static288.aClass156_3.method3774(this);
		this.aLong182 = (long) arg0;
		this.aLong183 = (long) arg0;
		this.aBoolean610 = true;
		this.aBoolean611 = arg1;
	}

	@OriginalMember(owner = "client!nia", name = "f", descriptor = "()Lclient!wq;")
	public Class392 method5856() {
		return this.aClass392_1;
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(Lclient!ha;)V")
	public void method5857(@OriginalArg(0) Class65 arg0) {
		this.aClass392_1.aClass307_1.method7411();
		for (@Pc(10) Class28_Sub10 local10 = (Class28_Sub10) this.aClass156_5.method3776(); local10 != null; local10 = (Class28_Sub10) this.aClass156_5.method3783()) {
			local10.method9030(arg0, this.aLong183);
		}
	}

	@OriginalMember(owner = "client!nia", name = "g", descriptor = "()V")
	public void method5858() {
		this.aBoolean609 = true;
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(Lclient!ha;[Lclient!sba;Z)V")
	private void method5859(@OriginalArg(0) Class65 arg0, @OriginalArg(1) Class313[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 32; local1++) {
			Static398.aBooleanArray32[local1] = false;
		}
		@Pc(21) int local21;
		label62: for (@Pc(16) Class28_Sub10 local16 = (Class28_Sub10) this.aClass156_5.method3776(); local16 != null; local16 = (Class28_Sub10) this.aClass156_5.method3783()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass313_2 == arg1[local21] || local16.aClass313_2 == arg1[local21].aClass313_1) {
						Static398.aBooleanArray32[local21] = true;
						local16.method9026();
						local16.aBoolean921 = false;
						continue label62;
					}
				}
			}
			if (local16.anInt10851 == 0) {
				local16.method9022();
				this.anInt7058--;
			} else {
				local16.aBoolean921 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && local21 != 32 && this.anInt7058 != 32; local21++) {
			if (!Static398.aBooleanArray32[local21]) {
				@Pc(104) Class28_Sub10 local104 = new Class28_Sub10(arg0, arg1[local21], this, this.aLong182);
				this.aClass156_5.method3774(local104);
				this.anInt7058++;
				Static398.aBooleanArray32[local21] = true;
			}
		}
	}
}
