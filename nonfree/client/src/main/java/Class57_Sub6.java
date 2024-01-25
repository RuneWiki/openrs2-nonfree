import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public final class Class57_Sub6 extends Class57 {

	@OriginalMember(owner = "client!mk", name = "w", descriptor = "I")
	public int anInt4433;

	@OriginalMember(owner = "client!mk", name = "y", descriptor = "I")
	public int anInt4435;

	@OriginalMember(owner = "client!mk", name = "z", descriptor = "I")
	public int anInt4436;

	@OriginalMember(owner = "client!mk", name = "A", descriptor = "I")
	public int anInt4437;

	@OriginalMember(owner = "client!mk", name = "C", descriptor = "I")
	public int anInt4438;

	@OriginalMember(owner = "client!mk", name = "k", descriptor = "Z")
	private boolean aBoolean378 = false;

	@OriginalMember(owner = "client!mk", name = "q", descriptor = "I")
	public int anInt4431 = 0;

	@OriginalMember(owner = "client!mk", name = "n", descriptor = "Z")
	public boolean aBoolean379 = false;

	@OriginalMember(owner = "client!mk", name = "r", descriptor = "Lclient!tm;")
	private Class193 aClass193_6 = new Class193();

	@OriginalMember(owner = "client!mk", name = "u", descriptor = "I")
	private int anInt4432 = 0;

	@OriginalMember(owner = "client!mk", name = "t", descriptor = "Lclient!sf;")
	public Class180 aClass180_26 = new Class180();

	@OriginalMember(owner = "client!mk", name = "v", descriptor = "Z")
	private boolean aBoolean380 = false;

	@OriginalMember(owner = "client!mk", name = "x", descriptor = "I")
	private int anInt4434 = 0;

	@OriginalMember(owner = "client!mk", name = "B", descriptor = "Lclient!wa;")
	public final Class214 aClass214_2 = new Class214();

	@OriginalMember(owner = "client!mk", name = "l", descriptor = "[Lclient!hq;")
	public Class57_Sub1_Sub1_Sub1[] aClass57_Sub1_Sub1_Sub1Array1 = new Class57_Sub1_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!mk", name = "p", descriptor = "J")
	private long aLong134;

	@OriginalMember(owner = "client!mk", name = "o", descriptor = "J")
	private long aLong133;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(I)V")
	public Class57_Sub6(@OriginalArg(0) int arg0) {
		Static67.aClass193_5.method5222(this);
		this.aLong134 = arg0;
		this.aLong133 = arg0;
		this.aBoolean380 = true;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIII)V")
	public void method3843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt4436 = arg0;
		this.anInt4438 = arg1;
		this.anInt4433 = arg2;
		this.anInt4437 = arg3;
		this.anInt4435 = arg4;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "()Lclient!wa;")
	public Class214 method3844() {
		return this.aClass214_2;
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "()V")
	public void method3845() {
		this.aBoolean378 = true;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "([Lclient!mp;Z)V")
	private void method3846(@OriginalArg(0) Class136[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static203.aBooleanArray14[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class2_Sub9_Sub19 local16 = (Class2_Sub9_Sub19) this.aClass180_26.method4919(); local16 != null; local16 = (Class2_Sub9_Sub19) this.aClass180_26.method4916()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass136_2 == arg0[local21] || local16.aClass136_2 == arg0[local21].aClass136_1) {
						Static203.aBooleanArray14[local21] = true;
						local16.method4826();
						continue label68;
					}
				}
			}
			local16.method5723();
			this.anInt4434--;
			if (local16.method5601()) {
				local16.method5600();
				Static38.anInt555--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt4434 != 8; local21++) {
			if (!Static203.aBooleanArray14[local21]) {
				@Pc(93) Class2_Sub9_Sub19 local93 = null;
				if (Static355.method5672(arg0[local21].anInt4533).anInt6348 == 1 && Static38.anInt555 < 32) {
					local93 = new Class2_Sub9_Sub19(arg0[local21], this);
					Static176.aClass65_1.method1742((long) arg0[local21].anInt4533, local93);
					Static38.anInt555++;
				}
				if (local93 == null) {
					local93 = new Class2_Sub9_Sub19(arg0[local21], this);
				}
				this.aClass180_26.method4909(local93);
				this.anInt4434++;
				Static203.aBooleanArray14[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(J)V")
	public void method3848(@OriginalArg(0) long arg0) {
		this.aLong134 = arg0;
	}

	@OriginalMember(owner = "client!mk", name = "d", descriptor = "()V")
	public void method3849() {
		this.aClass214_2.aClass55_1.method1298();
		for (@Pc(10) Class57_Sub7 local10 = (Class57_Sub7) this.aClass193_6.method5224(); local10 != null; local10 = (Class57_Sub7) this.aClass193_6.method5223()) {
			local10.method3944(this.aLong133);
		}
	}

	@OriginalMember(owner = "client!mk", name = "e", descriptor = "()V")
	public void method3850() {
		this.aBoolean379 = true;
		for (@Pc(8) Class2_Sub9_Sub19 local8 = (Class2_Sub9_Sub19) this.aClass180_26.method4919(); local8 != null; local8 = (Class2_Sub9_Sub19) this.aClass180_26.method4916()) {
			if (local8.aClass202_1.anInt6348 == 1) {
				local8.method5600();
			}
		}
		this.aClass57_Sub1_Sub1_Sub1Array1 = new Class57_Sub1_Sub1_Sub1[8192];
		this.anInt4431 = 0;
		this.aClass193_6 = new Class193();
		this.anInt4432 = 0;
		this.aClass180_26 = new Class180();
		this.anInt4434 = 0;
		this.method5452();
	}

	@OriginalMember(owner = "client!mk", name = "f", descriptor = "()V")
	private void method3851() {
		this.aBoolean378 = false;
	}

	@OriginalMember(owner = "client!mk", name = "g", descriptor = "()V")
	public void method3852() {
		this.aBoolean380 = true;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!dr;[Lclient!tr;Z)V")
	private void method3853(@OriginalArg(0) Class37 arg0, @OriginalArg(1) Class197[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static203.aBooleanArray13[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class57_Sub7 local16 = (Class57_Sub7) this.aClass193_6.method5224(); local16 != null; local16 = (Class57_Sub7) this.aClass193_6.method5223()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass197_1 == arg1[local21] || local16.aClass197_1 == arg1[local21].aClass197_2) {
						Static203.aBooleanArray13[local21] = true;
						local16.method3942();
						local16.aBoolean394 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt4548 == 0) {
				local16.method5452();
				this.anInt4432--;
			} else {
				local16.aBoolean394 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt4432 != 8; local21++) {
			if (!Static203.aBooleanArray13[local21]) {
				@Pc(101) Class57_Sub7 local101 = new Class57_Sub7(arg0, arg1[local21], this, this.aLong134);
				this.aClass193_6.method5222(local101);
				this.anInt4432++;
				Static203.aBooleanArray13[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!dr;J[Lclient!tr;[Lclient!mp;Z)V")
	public void method3854(@OriginalArg(0) Class37 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class197[] arg2, @OriginalArg(3) Class136[] arg3) {
		if (!this.aBoolean379) {
			this.method3853(arg0, arg2);
			this.method3846(arg3);
			this.aLong134 = arg1;
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!dr;J)Z")
	public boolean method3855(@OriginalArg(0) Class37 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong134 == this.aLong133) {
			this.method3851();
		} else {
			this.method3845();
		}
		if (arg1 - this.aLong134 > 750L) {
			this.method3850();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong133);
		@Pc(36) Class57_Sub7 local36;
		if (this.aBoolean380) {
			for (local36 = (Class57_Sub7) this.aClass193_6.method5224(); local36 != null; local36 = (Class57_Sub7) this.aClass193_6.method5223()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass78_1.anInt2236; local39++) {
					local36.method3943(arg1, arg0, !this.aBoolean378, 1);
				}
			}
			this.aBoolean380 = false;
		}
		for (local36 = (Class57_Sub7) this.aClass193_6.method5224(); local36 != null; local36 = (Class57_Sub7) this.aClass193_6.method5223()) {
			local36.method3943(arg1, arg0, !this.aBoolean378, local27);
		}
		this.aLong133 = arg1;
		return true;
	}
}
