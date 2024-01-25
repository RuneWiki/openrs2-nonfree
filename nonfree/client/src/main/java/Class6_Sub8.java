import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wk")
public final class Class6_Sub8 extends Class6 {

	@OriginalMember(owner = "client!wk", name = "t", descriptor = "I")
	public int anInt7589;

	@OriginalMember(owner = "client!wk", name = "w", descriptor = "I")
	public int anInt7590;

	@OriginalMember(owner = "client!wk", name = "y", descriptor = "I")
	public int anInt7592;

	@OriginalMember(owner = "client!wk", name = "z", descriptor = "I")
	public int anInt7593;

	@OriginalMember(owner = "client!wk", name = "A", descriptor = "I")
	public int anInt7594;

	@OriginalMember(owner = "client!wk", name = "m", descriptor = "Z")
	private boolean aBoolean652 = false;

	@OriginalMember(owner = "client!wk", name = "l", descriptor = "I")
	public int anInt7587 = 0;

	@OriginalMember(owner = "client!wk", name = "p", descriptor = "Z")
	public boolean aBoolean653 = false;

	@OriginalMember(owner = "client!wk", name = "j", descriptor = "Lclient!ku;")
	private Class138 aClass138_8 = new Class138();

	@OriginalMember(owner = "client!wk", name = "s", descriptor = "I")
	private int anInt7588 = 0;

	@OriginalMember(owner = "client!wk", name = "q", descriptor = "Lclient!ug;")
	public Class243 aClass243_52 = new Class243();

	@OriginalMember(owner = "client!wk", name = "x", descriptor = "I")
	private int anInt7591 = 0;

	@OriginalMember(owner = "client!wk", name = "u", descriptor = "Z")
	private boolean aBoolean654 = false;

	@OriginalMember(owner = "client!wk", name = "v", descriptor = "Lclient!sh;")
	public final Class227 aClass227_2 = new Class227();

	@OriginalMember(owner = "client!wk", name = "k", descriptor = "[Lclient!dq;")
	public Class6_Sub3_Sub1_Sub1[] aClass6_Sub3_Sub1_Sub1Array2 = new Class6_Sub3_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!wk", name = "n", descriptor = "J")
	private long aLong230;

	@OriginalMember(owner = "client!wk", name = "o", descriptor = "J")
	private long aLong231;

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(I)V")
	public Class6_Sub8(@OriginalArg(0) int arg0) {
		Static245.aClass138_4.method3307(this);
		this.aLong230 = arg0;
		this.aLong231 = arg0;
		this.aBoolean654 = true;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "()V")
	public void method5916() {
		this.aBoolean654 = true;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIII)V")
	public void method5917(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt7593 = arg0;
		this.anInt7594 = arg1;
		this.anInt7592 = arg2;
		this.anInt7590 = arg3;
		this.anInt7589 = arg4;
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "()V")
	public void method5918() {
		this.aClass227_2.aClass235_1.method4962();
		for (@Pc(10) Class6_Sub2 local10 = (Class6_Sub2) this.aClass138_8.method3311(); local10 != null; local10 = (Class6_Sub2) this.aClass138_8.method3312()) {
			local10.method50(this.aLong231);
		}
	}

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "()V")
	public void method5919() {
		this.aBoolean652 = true;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!qa;J[Lclient!wv;[Lclient!nk;Z)V")
	public void method5920(@OriginalArg(0) Class172 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class269[] arg2, @OriginalArg(3) Class165[] arg3) {
		if (!this.aBoolean653) {
			this.method5927(arg0, arg2);
			this.method5925(arg3);
			this.aLong230 = arg1;
		}
	}

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "()V")
	private void method5921() {
		this.aBoolean652 = false;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(J)V")
	public void method5922(@OriginalArg(0) long arg0) {
		this.aLong230 = arg0;
	}

	@OriginalMember(owner = "client!wk", name = "e", descriptor = "()Lclient!sh;")
	public Class227 method5923() {
		return this.aClass227_2;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!qa;J)Z")
	public boolean method5924(@OriginalArg(0) Class172 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong230 == this.aLong231) {
			this.method5921();
		} else {
			this.method5919();
		}
		if (arg1 - this.aLong230 > 750L) {
			this.method5928();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong231);
		@Pc(36) Class6_Sub2 local36;
		if (this.aBoolean654) {
			for (local36 = (Class6_Sub2) this.aClass138_8.method3311(); local36 != null; local36 = (Class6_Sub2) this.aClass138_8.method3312()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass160_1.anInt4924; local39++) {
					local36.method52(arg0, arg1, 1, !this.aBoolean652);
				}
			}
			this.aBoolean654 = false;
		}
		for (local36 = (Class6_Sub2) this.aClass138_8.method3311(); local36 != null; local36 = (Class6_Sub2) this.aClass138_8.method3312()) {
			local36.method52(arg0, arg1, local27, !this.aBoolean652);
		}
		this.aLong231 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "([Lclient!nk;Z)V")
	private void method5925(@OriginalArg(0) Class165[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static449.aBooleanArray27[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class3_Sub4_Sub2 local16 = (Class3_Sub4_Sub2) this.aClass243_52.method5208(); local16 != null; local16 = (Class3_Sub4_Sub2) this.aClass243_52.method5203()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass165_1 == arg0[local21] || local16.aClass165_1 == arg0[local21].aClass165_2) {
						Static449.aBooleanArray27[local21] = true;
						local16.method613();
						continue label68;
					}
				}
			}
			local16.method5977();
			this.anInt7591--;
			if (local16.method5946()) {
				local16.method5949();
				Static273.anInt5071--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt7591 != 8; local21++) {
			if (!Static449.aBooleanArray27[local21]) {
				@Pc(93) Class3_Sub4_Sub2 local93 = null;
				if (arg0[local21].method3869().anInt3103 == 1 && Static273.anInt5071 < 32) {
					local93 = new Class3_Sub4_Sub2(arg0[local21], this);
					Static2.aClass133_1.method3263((long) arg0[local21].anInt5051, local93);
					Static273.anInt5071++;
				}
				if (local93 == null) {
					local93 = new Class3_Sub4_Sub2(arg0[local21], this);
				}
				this.aClass243_52.method5198(local93);
				this.anInt7591++;
				Static449.aBooleanArray27[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!qa;[Lclient!wv;Z)V")
	private void method5927(@OriginalArg(0) Class172 arg0, @OriginalArg(1) Class269[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static449.aBooleanArray26[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class6_Sub2 local16 = (Class6_Sub2) this.aClass138_8.method3311(); local16 != null; local16 = (Class6_Sub2) this.aClass138_8.method3312()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass269_1 == arg1[local21] || local16.aClass269_1 == arg1[local21].aClass269_2) {
						Static449.aBooleanArray26[local21] = true;
						local16.method51();
						local16.aBoolean5 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt119 == 0) {
				local16.method5914();
				this.anInt7588--;
			} else {
				local16.aBoolean5 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt7588 != 8; local21++) {
			if (!Static449.aBooleanArray26[local21]) {
				@Pc(101) Class6_Sub2 local101 = new Class6_Sub2(arg0, arg1[local21], this, this.aLong230);
				this.aClass138_8.method3307(local101);
				this.anInt7588++;
				Static449.aBooleanArray26[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!wk", name = "g", descriptor = "()V")
	public void method5928() {
		this.aBoolean653 = true;
		for (@Pc(8) Class3_Sub4_Sub2 local8 = (Class3_Sub4_Sub2) this.aClass243_52.method5208(); local8 != null; local8 = (Class3_Sub4_Sub2) this.aClass243_52.method5203()) {
			if (local8.aClass102_1.anInt3103 == 1) {
				local8.method5949();
			}
		}
		this.aClass6_Sub3_Sub1_Sub1Array2 = new Class6_Sub3_Sub1_Sub1[8192];
		this.anInt7587 = 0;
		this.aClass138_8 = new Class138();
		this.anInt7588 = 0;
		this.aClass243_52 = new Class243();
		this.anInt7591 = 0;
		this.method5914();
	}
}
