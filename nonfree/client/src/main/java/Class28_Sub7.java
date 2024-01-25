import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sp")
public final class Class28_Sub7 extends Class28 {

	@OriginalMember(owner = "client!sp", name = "u", descriptor = "J")
	private long aLong260;

	@OriginalMember(owner = "client!sp", name = "v", descriptor = "J")
	private long aLong261;

	@OriginalMember(owner = "client!sp", name = "z", descriptor = "I")
	public int anInt9057;

	@OriginalMember(owner = "client!sp", name = "s", descriptor = "Z")
	public boolean aBoolean709 = false;

	@OriginalMember(owner = "client!sp", name = "p", descriptor = "Z")
	private boolean aBoolean708 = false;

	@OriginalMember(owner = "client!sp", name = "t", descriptor = "I")
	public int anInt9055 = 0;

	@OriginalMember(owner = "client!sp", name = "w", descriptor = "Lclient!vl;")
	private Class371 aClass371_8 = new Class371();

	@OriginalMember(owner = "client!sp", name = "x", descriptor = "I")
	private int anInt9056 = 0;

	@OriginalMember(owner = "client!sp", name = "y", descriptor = "Lclient!tm;")
	public Class338 aClass338_205 = new Class338();

	@OriginalMember(owner = "client!sp", name = "A", descriptor = "Z")
	public boolean aBoolean710 = false;

	@OriginalMember(owner = "client!sp", name = "C", descriptor = "Z")
	private boolean aBoolean711 = false;

	@OriginalMember(owner = "client!sp", name = "D", descriptor = "I")
	private int anInt9058 = 0;

	@OriginalMember(owner = "client!sp", name = "B", descriptor = "Lclient!ef;")
	public final Class84 aClass84_1 = new Class84();

	@OriginalMember(owner = "client!sp", name = "o", descriptor = "[Lclient!uea;")
	public final Class28_Sub4_Sub2_Sub1[] aClass28_Sub4_Sub2_Sub1Array2 = new Class28_Sub4_Sub2_Sub1[8192];

	@OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(IZ)V")
	public Class28_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method7920(arg0, arg1);
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(J)V")
	public void method7907(@OriginalArg(0) long arg0) {
		this.aLong261 = arg0;
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "()V")
	public void method7908() {
		this.aBoolean711 = true;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!ha;)V")
	public void method7909(@OriginalArg(0) Class13 arg0) {
		this.aClass84_1.aClass137_1.method3832();
		for (@Pc(10) Class28_Sub9 local10 = (Class28_Sub9) this.aClass371_8.method8911(); local10 != null; local10 = (Class28_Sub9) this.aClass371_8.method8917()) {
			local10.method8720(this.aLong260, arg0);
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!ha;J[Lclient!cba;[Lclient!kw;Z)V")
	public void method7910(@OriginalArg(0) Class13 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class49[] arg2, @OriginalArg(3) Class197[] arg3) {
		if (!this.aBoolean709) {
			this.method7918(arg0, arg2);
			this.method7912(arg3);
			this.aLong261 = arg1;
		}
	}

	@OriginalMember(owner = "client!sp", name = "c", descriptor = "()V")
	public void method7911() {
		this.aBoolean709 = true;
		for (@Pc(8) Class3_Sub11_Sub17 local8 = (Class3_Sub11_Sub17) this.aClass338_205.method8177(); local8 != null; local8 = (Class3_Sub11_Sub17) this.aClass338_205.method8168()) {
			if (local8.aClass59_1.anInt1355 == 1) {
				local8.method9345();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass28_Sub4_Sub2_Sub1Array2.length; local27++) {
			if (this.aClass28_Sub4_Sub2_Sub1Array2[local27] != null) {
				this.aClass28_Sub4_Sub2_Sub1Array2[local27].method8437();
				this.aClass28_Sub4_Sub2_Sub1Array2[local27] = null;
			}
		}
		this.anInt9055 = 0;
		this.aClass371_8 = new Class371();
		this.anInt9056 = 0;
		this.aClass338_205 = new Class338();
		this.anInt9058 = 0;
		this.method9276();
		Static208.aClass28_Sub7Array1[Static449.anInt7433] = this;
		Static449.anInt7433 = Static449.anInt7433 + 1 & Static292.anIntArray444[Static351.anInt5714];
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "([Lclient!kw;Z)V")
	private void method7912(@OriginalArg(0) Class197[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static556.aBooleanArray44[local1] = false;
		}
		@Pc(21) int local21;
		label71: for (@Pc(16) Class3_Sub11_Sub17 local16 = (Class3_Sub11_Sub17) this.aClass338_205.method8177(); local16 != null; local16 = (Class3_Sub11_Sub17) this.aClass338_205.method8168()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass197_2 == arg0[local21] || local16.aClass197_2 == arg0[local21].aClass197_1) {
						Static556.aBooleanArray44[local21] = true;
						local16.method8132();
						continue label71;
					}
				}
			}
			local16.method9380();
			this.anInt9058--;
			if (local16.method9346()) {
				local16.method9345();
				Static610.anInt9845--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && local21 != 8 && this.anInt9058 != 8; local21++) {
			if (!Static556.aBooleanArray44[local21]) {
				@Pc(96) Class3_Sub11_Sub17 local96 = null;
				if (arg0[local21].method4971().anInt1355 == 1 && Static610.anInt9845 < 32) {
					local96 = new Class3_Sub11_Sub17(arg0[local21], this);
					Static457.aClass332_1.method8066(local96, (long) arg0[local21].anInt5429);
					Static610.anInt9845++;
				}
				if (local96 == null) {
					local96 = new Class3_Sub11_Sub17(arg0[local21], this);
				}
				this.aClass338_205.method8171(local96);
				this.anInt9058++;
				Static556.aBooleanArray44[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!ha;J)Z")
	public boolean method7913(@OriginalArg(0) Class13 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong261 == this.aLong260) {
			this.method7919();
		} else {
			this.method7915();
		}
		if (arg1 - this.aLong261 > 750L) {
			this.method7911();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong260);
		@Pc(36) Class28_Sub9 local36;
		if (this.aBoolean711) {
			for (local36 = (Class28_Sub9) this.aClass371_8.method8911(); local36 != null; local36 = (Class28_Sub9) this.aClass371_8.method8917()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass235_1.anInt6136; local39++) {
					local36.method8721(arg0, 1, arg1, !this.aBoolean708);
				}
			}
			this.aBoolean711 = false;
		}
		for (local36 = (Class28_Sub9) this.aClass371_8.method8911(); local36 != null; local36 = (Class28_Sub9) this.aClass371_8.method8917()) {
			local36.method8721(arg0, local27, arg1, !this.aBoolean708);
		}
		this.aLong260 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIIII)V")
	public void method7914(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt9057 = arg0;
	}

	@OriginalMember(owner = "client!sp", name = "d", descriptor = "()V")
	public void method7915() {
		this.aBoolean708 = true;
	}

	@OriginalMember(owner = "client!sp", name = "e", descriptor = "()Lclient!ef;")
	public Class84 method7917() {
		return this.aClass84_1;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!ha;[Lclient!cba;Z)V")
	private void method7918(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class49[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 32; local1++) {
			Static556.aBooleanArray45[local1] = false;
		}
		@Pc(21) int local21;
		label62: for (@Pc(16) Class28_Sub9 local16 = (Class28_Sub9) this.aClass371_8.method8911(); local16 != null; local16 = (Class28_Sub9) this.aClass371_8.method8917()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass49_2 == arg1[local21] || local16.aClass49_2 == arg1[local21].aClass49_1) {
						Static556.aBooleanArray45[local21] = true;
						local16.method8717();
						local16.aBoolean757 = false;
						continue label62;
					}
				}
			}
			if (local16.anInt9908 == 0) {
				local16.method9276();
				this.anInt9056--;
			} else {
				local16.aBoolean757 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && local21 != 32 && this.anInt9056 != 32; local21++) {
			if (!Static556.aBooleanArray45[local21]) {
				@Pc(104) Class28_Sub9 local104 = new Class28_Sub9(arg0, arg1[local21], this, this.aLong261);
				this.aClass371_8.method8908(local104);
				this.anInt9056++;
				Static556.aBooleanArray45[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!sp", name = "f", descriptor = "()V")
	private void method7919() {
		this.aBoolean708 = false;
	}

	@OriginalMember(owner = "client!sp", name = "c", descriptor = "(IZ)V")
	public void method7920(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static544.aClass371_6.method8908(this);
		this.aLong261 = (long) arg0;
		this.aLong260 = (long) arg0;
		this.aBoolean711 = true;
		this.aBoolean710 = arg1;
	}

	@OriginalMember(owner = "client!sp", name = "g", descriptor = "()Lclient!ef;")
	public Class84 method7921() {
		this.aClass84_1.aClass137_1.method3832();
		for (@Pc(6) int local6 = 0; local6 < this.aClass28_Sub4_Sub2_Sub1Array2.length; local6++) {
			if (this.aClass28_Sub4_Sub2_Sub1Array2[local6] != null && this.aClass28_Sub4_Sub2_Sub1Array2[local6].aClass28_Sub9_1 != null) {
				this.aClass84_1.aClass137_1.method3829(this.aClass28_Sub4_Sub2_Sub1Array2[local6]);
			}
		}
		return this.aClass84_1;
	}
}
