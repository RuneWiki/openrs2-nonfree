import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class39_Sub8 extends Class39 {

	@OriginalMember(owner = "client!vc", name = "u", descriptor = "I")
	public int anInt7257;

	@OriginalMember(owner = "client!vc", name = "v", descriptor = "I")
	public int anInt7258;

	@OriginalMember(owner = "client!vc", name = "x", descriptor = "I")
	public int anInt7260;

	@OriginalMember(owner = "client!vc", name = "A", descriptor = "I")
	public int anInt7261;

	@OriginalMember(owner = "client!vc", name = "B", descriptor = "I")
	public int anInt7262;

	@OriginalMember(owner = "client!vc", name = "j", descriptor = "Z")
	public boolean aBoolean470 = false;

	@OriginalMember(owner = "client!vc", name = "o", descriptor = "I")
	public int anInt7255 = 0;

	@OriginalMember(owner = "client!vc", name = "q", descriptor = "Z")
	private boolean aBoolean471 = false;

	@OriginalMember(owner = "client!vc", name = "m", descriptor = "Lclient!qi;")
	private Class188 aClass188_7 = new Class188();

	@OriginalMember(owner = "client!vc", name = "s", descriptor = "I")
	private int anInt7256 = 0;

	@OriginalMember(owner = "client!vc", name = "t", descriptor = "Lclient!wo;")
	public Class266 aClass266_48 = new Class266();

	@OriginalMember(owner = "client!vc", name = "w", descriptor = "I")
	private int anInt7259 = 0;

	@OriginalMember(owner = "client!vc", name = "z", descriptor = "Z")
	private boolean aBoolean472 = false;

	@OriginalMember(owner = "client!vc", name = "y", descriptor = "Lclient!qb;")
	public final Class185 aClass185_2 = new Class185();

	@OriginalMember(owner = "client!vc", name = "r", descriptor = "[Lclient!uu;")
	public Class39_Sub2_Sub1_Sub1[] aClass39_Sub2_Sub1_Sub1Array2 = new Class39_Sub2_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!vc", name = "k", descriptor = "J")
	private long aLong210;

	@OriginalMember(owner = "client!vc", name = "n", descriptor = "J")
	private long aLong211;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(I)V")
	public Class39_Sub8(@OriginalArg(0) int arg0) {
		Static138.aClass188_3.method4538(this);
		this.aLong210 = arg0;
		this.aLong211 = arg0;
		this.aBoolean472 = true;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "()V")
	public void method5617() {
		this.aBoolean471 = true;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!qa;J[Lclient!vj;[Lclient!it;Z)V")
	public void method5618(@OriginalArg(0) Class109 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class252[] arg2, @OriginalArg(3) Class122[] arg3) {
		if (!this.aBoolean470) {
			this.method5623(arg0, arg2);
			this.method5627(arg3);
			this.aLong210 = arg1;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!qa;J)Z")
	public boolean method5619(@OriginalArg(0) Class109 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong210 == this.aLong211) {
			this.method5625();
		} else {
			this.method5617();
		}
		if (arg1 - this.aLong210 > 750L) {
			this.method5620();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong211);
		@Pc(36) Class39_Sub6 local36;
		if (this.aBoolean472) {
			for (local36 = (Class39_Sub6) this.aClass188_7.method4534(); local36 != null; local36 = (Class39_Sub6) this.aClass188_7.method4530()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass223_1.anInt6685; local39++) {
					local36.method3779(arg1, arg0, !this.aBoolean471, 1);
				}
			}
			this.aBoolean472 = false;
		}
		for (local36 = (Class39_Sub6) this.aClass188_7.method4534(); local36 != null; local36 = (Class39_Sub6) this.aClass188_7.method4530()) {
			local36.method3779(arg1, arg0, !this.aBoolean471, local27);
		}
		this.aLong211 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "()V")
	public void method5620() {
		this.aBoolean470 = true;
		for (@Pc(8) Class1_Sub2_Sub13 local8 = (Class1_Sub2_Sub13) this.aClass266_48.method6000(); local8 != null; local8 = (Class1_Sub2_Sub13) this.aClass266_48.method5994()) {
			if (local8.aClass61_1.anInt1619 == 1) {
				local8.method5883();
			}
		}
		this.aClass39_Sub2_Sub1_Sub1Array2 = new Class39_Sub2_Sub1_Sub1[8192];
		this.anInt7255 = 0;
		this.aClass188_7 = new Class188();
		this.anInt7256 = 0;
		this.aClass266_48 = new Class266();
		this.anInt7259 = 0;
		this.method5616();
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "()V")
	public void method5621() {
		this.aClass185_2.aClass212_1.method4958();
		for (@Pc(10) Class39_Sub6 local10 = (Class39_Sub6) this.aClass188_7.method4534(); local10 != null; local10 = (Class39_Sub6) this.aClass188_7.method4530()) {
			local10.method3781(this.aLong211);
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!qa;[Lclient!vj;Z)V")
	private void method5623(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class252[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static418.aBooleanArray27[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class39_Sub6 local16 = (Class39_Sub6) this.aClass188_7.method4534(); local16 != null; local16 = (Class39_Sub6) this.aClass188_7.method4530()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass252_1 == arg1[local21] || local16.aClass252_1 == arg1[local21].aClass252_2) {
						Static418.aBooleanArray27[local21] = true;
						local16.method3777();
						local16.aBoolean316 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt4616 == 0) {
				local16.method5616();
				this.anInt7256--;
			} else {
				local16.aBoolean316 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt7256 != 8; local21++) {
			if (!Static418.aBooleanArray27[local21]) {
				@Pc(101) Class39_Sub6 local101 = new Class39_Sub6(arg0, arg1[local21], this, this.aLong210);
				this.aClass188_7.method4538(local101);
				this.anInt7256++;
				Static418.aBooleanArray27[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIII)V")
	public void method5624(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt7262 = arg0;
		this.anInt7258 = arg1;
		this.anInt7261 = arg2;
		this.anInt7257 = arg3;
		this.anInt7260 = arg4;
	}

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "()V")
	private void method5625() {
		this.aBoolean471 = false;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(J)V")
	public void method5626(@OriginalArg(0) long arg0) {
		this.aLong210 = arg0;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "([Lclient!it;Z)V")
	private void method5627(@OriginalArg(0) Class122[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static418.aBooleanArray26[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class1_Sub2_Sub13 local16 = (Class1_Sub2_Sub13) this.aClass266_48.method6000(); local16 != null; local16 = (Class1_Sub2_Sub13) this.aClass266_48.method5994()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass122_2 == arg0[local21] || local16.aClass122_2 == arg0[local21].aClass122_1) {
						Static418.aBooleanArray26[local21] = true;
						local16.method4369();
						continue label68;
					}
				}
			}
			local16.method6071();
			this.anInt7259--;
			if (local16.method5884()) {
				local16.method5883();
				Static199.anInt3620--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt7259 != 8; local21++) {
			if (!Static418.aBooleanArray26[local21]) {
				@Pc(93) Class1_Sub2_Sub13 local93 = null;
				if (arg0[local21].method2819().anInt1619 == 1 && Static199.anInt3620 < 32) {
					local93 = new Class1_Sub2_Sub13(arg0[local21], this);
					Static235.aClass249_1.method5639((long) arg0[local21].anInt3361, local93);
					Static199.anInt3620++;
				}
				if (local93 == null) {
					local93 = new Class1_Sub2_Sub13(arg0[local21], this);
				}
				this.aClass266_48.method5998(local93);
				this.anInt7259++;
				Static418.aBooleanArray26[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "()V")
	public void method5628() {
		this.aBoolean472 = true;
	}

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "()Lclient!qb;")
	public Class185 method5629() {
		return this.aClass185_2;
	}
}
