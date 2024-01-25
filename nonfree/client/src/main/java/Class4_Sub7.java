import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mq")
public final class Class4_Sub7 extends Class4 {

	@OriginalMember(owner = "client!mq", name = "v", descriptor = "I")
	public int anInt4573;

	@OriginalMember(owner = "client!mq", name = "w", descriptor = "I")
	public int anInt4574;

	@OriginalMember(owner = "client!mq", name = "z", descriptor = "I")
	public int anInt4575;

	@OriginalMember(owner = "client!mq", name = "A", descriptor = "I")
	public int anInt4576;

	@OriginalMember(owner = "client!mq", name = "B", descriptor = "I")
	public int anInt4577;

	@OriginalMember(owner = "client!mq", name = "r", descriptor = "I")
	public int anInt4571 = 0;

	@OriginalMember(owner = "client!mq", name = "n", descriptor = "Z")
	public boolean aBoolean308 = false;

	@OriginalMember(owner = "client!mq", name = "q", descriptor = "Z")
	private boolean aBoolean309 = false;

	@OriginalMember(owner = "client!mq", name = "k", descriptor = "Lclient!ks;")
	private Class141 aClass141_7 = new Class141();

	@OriginalMember(owner = "client!mq", name = "t", descriptor = "I")
	private int anInt4572 = 0;

	@OriginalMember(owner = "client!mq", name = "u", descriptor = "Lclient!oe;")
	public Class181 aClass181_45 = new Class181();

	@OriginalMember(owner = "client!mq", name = "x", descriptor = "Z")
	private boolean aBoolean310 = false;

	@OriginalMember(owner = "client!mq", name = "C", descriptor = "I")
	private int anInt4578 = 0;

	@OriginalMember(owner = "client!mq", name = "y", descriptor = "Lclient!kp;")
	public final Class140 aClass140_2 = new Class140();

	@OriginalMember(owner = "client!mq", name = "s", descriptor = "[Lclient!vl;")
	public Class4_Sub2_Sub1_Sub1[] aClass4_Sub2_Sub1_Sub1Array1 = new Class4_Sub2_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!mq", name = "o", descriptor = "J")
	private long aLong137;

	@OriginalMember(owner = "client!mq", name = "p", descriptor = "J")
	private long aLong138;

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(I)V")
	public Class4_Sub7(@OriginalArg(0) int arg0) {
		Static356.aClass141_8.method3356(this);
		this.aLong137 = arg0;
		this.aLong138 = arg0;
		this.aBoolean310 = true;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "()V")
	public void method3773() {
		this.aBoolean310 = true;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lclient!ya;[Lclient!uj;Z)V")
	private void method3774(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class244[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static252.aBooleanArray33[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class4_Sub8 local16 = (Class4_Sub8) this.aClass141_7.method3357(); local16 != null; local16 = (Class4_Sub8) this.aClass141_7.method3360()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass244_2 == arg1[local21] || local16.aClass244_2 == arg1[local21].aClass244_1) {
						Static252.aBooleanArray33[local21] = true;
						local16.method5738();
						local16.aBoolean489 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt6985 == 0) {
				local16.method5737();
				this.anInt4572--;
			} else {
				local16.aBoolean489 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt4572 != 8; local21++) {
			if (!Static252.aBooleanArray33[local21]) {
				@Pc(101) Class4_Sub8 local101 = new Class4_Sub8(arg0, arg1[local21], this, this.aLong137);
				this.aClass141_7.method3356(local101);
				this.anInt4572++;
				Static252.aBooleanArray33[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "()V")
	private void method3775() {
		this.aBoolean309 = false;
	}

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "()V")
	public void method3776() {
		this.aBoolean309 = true;
	}

	@OriginalMember(owner = "client!mq", name = "d", descriptor = "()Lclient!kp;")
	public Class140 method3777() {
		return this.aClass140_2;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lclient!ya;J)Z")
	public boolean method3778(@OriginalArg(0) Class39 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong137 == this.aLong138) {
			this.method3775();
		} else {
			this.method3776();
		}
		if (arg1 - this.aLong137 > 750L) {
			this.method3785();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong138);
		@Pc(36) Class4_Sub8 local36;
		if (this.aBoolean310) {
			for (local36 = (Class4_Sub8) this.aClass141_7.method3357(); local36 != null; local36 = (Class4_Sub8) this.aClass141_7.method3360()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass86_1.anInt2541; local39++) {
					local36.method5745(arg1, 1, !this.aBoolean309, arg0);
				}
			}
			this.aBoolean310 = false;
		}
		for (local36 = (Class4_Sub8) this.aClass141_7.method3357(); local36 != null; local36 = (Class4_Sub8) this.aClass141_7.method3360()) {
			local36.method5745(arg1, local27, !this.aBoolean309, arg0);
		}
		this.aLong138 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lclient!ya;J[Lclient!uj;[Lclient!dv;Z)V")
	public void method3779(@OriginalArg(0) Class39 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class244[] arg2, @OriginalArg(3) Class57[] arg3) {
		if (!this.aBoolean308) {
			this.method3774(arg0, arg2);
			this.method3780(arg3);
			this.aLong137 = arg1;
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "([Lclient!dv;Z)V")
	private void method3780(@OriginalArg(0) Class57[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static252.aBooleanArray32[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class1_Sub2_Sub16 local16 = (Class1_Sub2_Sub16) this.aClass181_45.method4112(); local16 != null; local16 = (Class1_Sub2_Sub16) this.aClass181_45.method4104()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass57_2 == arg0[local21] || local16.aClass57_2 == arg0[local21].aClass57_1) {
						Static252.aBooleanArray32[local21] = true;
						local16.method4941();
						continue label68;
					}
				}
			}
			local16.method6020();
			this.anInt4578--;
			if (local16.method5810()) {
				local16.method5813();
				Static434.anInt7029--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt4578 != 8; local21++) {
			if (!Static252.aBooleanArray32[local21]) {
				@Pc(93) Class1_Sub2_Sub16 local93 = null;
				if (arg0[local21].method1591().anInt2791 == 1 && Static434.anInt7029 < 32) {
					local93 = new Class1_Sub2_Sub16(arg0[local21], this);
					Static311.aClass258_1.method5654(local93, (long) arg0[local21].anInt1829);
					Static434.anInt7029++;
				}
				if (local93 == null) {
					local93 = new Class1_Sub2_Sub16(arg0[local21], this);
				}
				this.aClass181_45.method4102(local93);
				this.anInt4578++;
				Static252.aBooleanArray32[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!mq", name = "e", descriptor = "()V")
	public void method3781() {
		this.aClass140_2.aClass232_1.method5224();
		for (@Pc(10) Class4_Sub8 local10 = (Class4_Sub8) this.aClass141_7.method3357(); local10 != null; local10 = (Class4_Sub8) this.aClass141_7.method3360()) {
			local10.method5743(this.aLong138);
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(J)V")
	public void method3783(@OriginalArg(0) long arg0) {
		this.aLong137 = arg0;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIIII)V")
	public void method3784(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt4576 = arg0;
		this.anInt4573 = arg1;
		this.anInt4574 = arg2;
		this.anInt4577 = arg3;
		this.anInt4575 = arg4;
	}

	@OriginalMember(owner = "client!mq", name = "g", descriptor = "()V")
	public void method3785() {
		this.aBoolean308 = true;
		for (@Pc(8) Class1_Sub2_Sub16 local8 = (Class1_Sub2_Sub16) this.aClass181_45.method4112(); local8 != null; local8 = (Class1_Sub2_Sub16) this.aClass181_45.method4104()) {
			if (local8.aClass102_1.anInt2791 == 1) {
				local8.method5813();
			}
		}
		this.aClass4_Sub2_Sub1_Sub1Array1 = new Class4_Sub2_Sub1_Sub1[8192];
		this.anInt4571 = 0;
		this.aClass141_7 = new Class141();
		this.anInt4572 = 0;
		this.aClass181_45 = new Class181();
		this.anInt4578 = 0;
		this.method5737();
	}
}
