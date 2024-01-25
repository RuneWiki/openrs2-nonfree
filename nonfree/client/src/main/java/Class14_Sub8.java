import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class14_Sub8 extends Class14 {

	@OriginalMember(owner = "client!l", name = "j", descriptor = "J")
	private long aLong155;

	@OriginalMember(owner = "client!l", name = "k", descriptor = "J")
	private long aLong156;

	@OriginalMember(owner = "client!l", name = "v", descriptor = "I")
	public int anInt4868;

	@OriginalMember(owner = "client!l", name = "i", descriptor = "I")
	public int anInt4865 = 0;

	@OriginalMember(owner = "client!l", name = "l", descriptor = "Z")
	public boolean aBoolean397 = false;

	@OriginalMember(owner = "client!l", name = "n", descriptor = "Z")
	private boolean aBoolean398 = false;

	@OriginalMember(owner = "client!l", name = "h", descriptor = "Lclient!vm;")
	private Class363 aClass363_6 = new Class363();

	@OriginalMember(owner = "client!l", name = "q", descriptor = "I")
	private int anInt4866 = 0;

	@OriginalMember(owner = "client!l", name = "r", descriptor = "Lclient!ro;")
	public Class306 aClass306_19 = new Class306();

	@OriginalMember(owner = "client!l", name = "s", descriptor = "Z")
	private boolean aBoolean399 = false;

	@OriginalMember(owner = "client!l", name = "u", descriptor = "I")
	private int anInt4867 = 0;

	@OriginalMember(owner = "client!l", name = "w", descriptor = "Z")
	public boolean aBoolean400 = false;

	@OriginalMember(owner = "client!l", name = "t", descriptor = "Lclient!uj;")
	public final Class345 aClass345_1 = new Class345();

	@OriginalMember(owner = "client!l", name = "o", descriptor = "[Lclient!iu;")
	public final Class14_Sub2_Sub2_Sub1[] aClass14_Sub2_Sub2_Sub1Array7 = new Class14_Sub2_Sub2_Sub1[8192];

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(IZ)V")
	public Class14_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method4448(arg0, arg1);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIII)V")
	public void method4447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt4868 = arg0;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IZ)V")
	public void method4448(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static310.aClass363_7.method8480(this);
		this.aLong156 = (long) arg0;
		this.aLong155 = (long) arg0;
		this.aBoolean399 = true;
		this.aBoolean400 = arg1;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!ha;[Lclient!cm;Z)V")
	private void method4449(@OriginalArg(0) Class126 arg0, @OriginalArg(1) Class57[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 32; local1++) {
			Static307.aBooleanArray32[local1] = false;
		}
		@Pc(21) int local21;
		label62: for (@Pc(16) Class14_Sub7 local16 = (Class14_Sub7) this.aClass363_6.method8484(); local16 != null; local16 = (Class14_Sub7) this.aClass363_6.method8478()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass57_2 == arg1[local21] || local16.aClass57_2 == arg1[local21].aClass57_1) {
						Static307.aBooleanArray32[local21] = true;
						local16.method3650();
						local16.aBoolean331 = false;
						continue label62;
					}
				}
			}
			if (local16.anInt4016 == 0) {
				local16.method8904();
				this.anInt4866--;
			} else {
				local16.aBoolean331 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && local21 != 32 && this.anInt4866 != 32; local21++) {
			if (!Static307.aBooleanArray32[local21]) {
				@Pc(104) Class14_Sub7 local104 = new Class14_Sub7(arg0, arg1[local21], this, this.aLong156);
				this.aClass363_6.method8480(local104);
				this.anInt4866++;
				Static307.aBooleanArray32[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "()V")
	public void method4450() {
		this.aBoolean398 = true;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!ha;)V")
	public void method4451(@OriginalArg(0) Class126 arg0) {
		this.aClass345_1.aClass42_1.method857();
		for (@Pc(10) Class14_Sub7 local10 = (Class14_Sub7) this.aClass363_6.method8484(); local10 != null; local10 = (Class14_Sub7) this.aClass363_6.method8478()) {
			local10.method3649(this.aLong155, arg0);
		}
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "()V")
	private void method4452() {
		this.aBoolean398 = false;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!ha;J)Z")
	public boolean method4453(@OriginalArg(0) Class126 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong156 == this.aLong155) {
			this.method4452();
		} else {
			this.method4450();
		}
		if (arg1 - this.aLong156 > 750L) {
			this.method4459();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong155);
		@Pc(36) Class14_Sub7 local36;
		if (this.aBoolean399) {
			for (local36 = (Class14_Sub7) this.aClass363_6.method8484(); local36 != null; local36 = (Class14_Sub7) this.aClass363_6.method8478()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass107_1.anInt2490; local39++) {
					local36.method3648(1, !this.aBoolean398, arg0, arg1);
				}
			}
			this.aBoolean399 = false;
		}
		for (local36 = (Class14_Sub7) this.aClass363_6.method8484(); local36 != null; local36 = (Class14_Sub7) this.aClass363_6.method8478()) {
			local36.method3648(local27, !this.aBoolean398, arg0, arg1);
		}
		this.aLong155 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([Lclient!hi;Z)V")
	private void method4454(@OriginalArg(0) Class143[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static307.aBooleanArray33[local1] = false;
		}
		@Pc(21) int local21;
		label71: for (@Pc(16) Class5_Sub4_Sub18 local16 = (Class5_Sub4_Sub18) this.aClass306_19.method7313(); local16 != null; local16 = (Class5_Sub4_Sub18) this.aClass306_19.method7301()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass143_2 == arg0[local21] || local16.aClass143_2 == arg0[local21].aClass143_1) {
						Static307.aBooleanArray33[local21] = true;
						local16.method7691();
						continue label71;
					}
				}
			}
			local16.method8911();
			this.anInt4867--;
			if (local16.method8738()) {
				local16.method8741();
				Static172.anInt3112--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && local21 != 8 && this.anInt4867 != 8; local21++) {
			if (!Static307.aBooleanArray33[local21]) {
				@Pc(96) Class5_Sub4_Sub18 local96 = null;
				if (arg0[local21].method3233().anInt8618 == 1 && Static172.anInt3112 < 32) {
					local96 = new Class5_Sub4_Sub18(arg0[local21], this);
					Static89.aClass197_1.method4402(local96, (long) arg0[local21].anInt3656);
					Static172.anInt3112++;
				}
				if (local96 == null) {
					local96 = new Class5_Sub4_Sub18(arg0[local21], this);
				}
				this.aClass306_19.method7303(local96);
				this.anInt4867++;
				Static307.aBooleanArray33[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "d", descriptor = "()Lclient!uj;")
	public Class345 method4455() {
		this.aClass345_1.aClass42_1.method857();
		for (@Pc(6) int local6 = 0; local6 < this.aClass14_Sub2_Sub2_Sub1Array7.length; local6++) {
			if (this.aClass14_Sub2_Sub2_Sub1Array7[local6] != null && this.aClass14_Sub2_Sub2_Sub1Array7[local6].aClass14_Sub7_1 != null) {
				this.aClass345_1.aClass42_1.method856(this.aClass14_Sub2_Sub2_Sub1Array7[local6]);
			}
		}
		return this.aClass345_1;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!ha;J[Lclient!cm;[Lclient!hi;Z)V")
	public void method4456(@OriginalArg(0) Class126 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class57[] arg2, @OriginalArg(3) Class143[] arg3) {
		if (!this.aBoolean397) {
			this.method4449(arg0, arg2);
			this.method4454(arg3);
			this.aLong156 = arg1;
		}
	}

	@OriginalMember(owner = "client!l", name = "e", descriptor = "()V")
	public void method4457() {
		this.aBoolean399 = true;
	}

	@OriginalMember(owner = "client!l", name = "f", descriptor = "()Lclient!uj;")
	public Class345 method4458() {
		return this.aClass345_1;
	}

	@OriginalMember(owner = "client!l", name = "g", descriptor = "()V")
	public void method4459() {
		this.aBoolean397 = true;
		for (@Pc(8) Class5_Sub4_Sub18 local8 = (Class5_Sub4_Sub18) this.aClass306_19.method7313(); local8 != null; local8 = (Class5_Sub4_Sub18) this.aClass306_19.method7301()) {
			if (local8.aClass313_1.anInt8618 == 1) {
				local8.method8741();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass14_Sub2_Sub2_Sub1Array7.length; local27++) {
			if (this.aClass14_Sub2_Sub2_Sub1Array7[local27] != null) {
				this.aClass14_Sub2_Sub2_Sub1Array7[local27].method3780();
				this.aClass14_Sub2_Sub2_Sub1Array7[local27] = null;
			}
		}
		this.anInt4865 = 0;
		this.aClass363_6 = new Class363();
		this.anInt4866 = 0;
		this.aClass306_19 = new Class306();
		this.anInt4867 = 0;
		this.method8904();
		Static270.aClass14_Sub8Array1[Static362.anInt6388] = this;
		Static362.anInt6388 = Static362.anInt6388 + 1 & Static316.anIntArray398[Static210.anInt3641];
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(J)V")
	public void method4461(@OriginalArg(0) long arg0) {
		this.aLong156 = arg0;
	}
}
