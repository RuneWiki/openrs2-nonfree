import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jga")
public abstract class Class1_Sub30 extends Class1 {

	@OriginalMember(owner = "client!jga", name = "bb", descriptor = "[I")
	public static final int[] anIntArray363 = new int[4096];

	@OriginalMember(owner = "client!jga", name = "k", descriptor = "Z")
	protected boolean aBoolean472;

	@OriginalMember(owner = "client!jga", name = "m", descriptor = "Z")
	protected boolean aBoolean473;

	@OriginalMember(owner = "client!jga", name = "P", descriptor = "Z")
	public boolean aBoolean485;

	@OriginalMember(owner = "client!jga", name = "n", descriptor = "Z")
	public boolean aBoolean474 = false;

	@OriginalMember(owner = "client!jga", name = "r", descriptor = "Z")
	public boolean aBoolean475 = false;

	@OriginalMember(owner = "client!jga", name = "o", descriptor = "I")
	protected int anInt6182 = 0;

	@OriginalMember(owner = "client!jga", name = "u", descriptor = "I")
	public int anInt6186 = 0;

	@OriginalMember(owner = "client!jga", name = "B", descriptor = "Z")
	public boolean aBoolean479 = true;

	@OriginalMember(owner = "client!jga", name = "C", descriptor = "I")
	public int anInt6190 = 0;

	@OriginalMember(owner = "client!jga", name = "E", descriptor = "Z")
	public boolean aBoolean481 = true;

	@OriginalMember(owner = "client!jga", name = "H", descriptor = "I")
	public int anInt6192 = 127;

	@OriginalMember(owner = "client!jga", name = "O", descriptor = "Z")
	public boolean aBoolean484 = true;

	@OriginalMember(owner = "client!jga", name = "A", descriptor = "Z")
	public boolean aBoolean478 = true;

	@OriginalMember(owner = "client!jga", name = "s", descriptor = "I")
	public int anInt6184 = 3;

	@OriginalMember(owner = "client!jga", name = "L", descriptor = "I")
	public int anInt6195 = 3;

	@OriginalMember(owner = "client!jga", name = "v", descriptor = "Z")
	public boolean aBoolean476 = true;

	@OriginalMember(owner = "client!jga", name = "N", descriptor = "Z")
	public boolean aBoolean483 = true;

	@OriginalMember(owner = "client!jga", name = "I", descriptor = "I")
	public int anInt6193 = 1;

	@OriginalMember(owner = "client!jga", name = "D", descriptor = "Z")
	public boolean aBoolean480 = true;

	@OriginalMember(owner = "client!jga", name = "Q", descriptor = "I")
	public int anInt6197 = 0;

	@OriginalMember(owner = "client!jga", name = "y", descriptor = "Z")
	public boolean aBoolean477 = true;

	@OriginalMember(owner = "client!jga", name = "K", descriptor = "Z")
	public boolean aBoolean482 = false;

	@OriginalMember(owner = "client!jga", name = "V", descriptor = "I")
	public int anInt6200 = 2;

	@OriginalMember(owner = "client!jga", name = "X", descriptor = "I")
	public int anInt6201 = 0;

	@OriginalMember(owner = "client!jga", name = "Y", descriptor = "Z")
	public boolean aBoolean488 = true;

	@OriginalMember(owner = "client!jga", name = "J", descriptor = "I")
	public int anInt6194 = 0;

	@OriginalMember(owner = "client!jga", name = "R", descriptor = "I")
	protected int anInt6198 = 2;

	@OriginalMember(owner = "client!jga", name = "j", descriptor = "I")
	public int anInt6180 = 0;

	@OriginalMember(owner = "client!jga", name = "T", descriptor = "I")
	public int anInt6199 = 2;

	@OriginalMember(owner = "client!jga", name = "Z", descriptor = "Z")
	protected boolean aBoolean489 = true;

	@OriginalMember(owner = "client!jga", name = "G", descriptor = "I")
	protected int anInt6191 = 0;

	@OriginalMember(owner = "client!jga", name = "W", descriptor = "Z")
	public boolean aBoolean487 = true;

	@OriginalMember(owner = "client!jga", name = "U", descriptor = "Z")
	public boolean aBoolean486 = true;

	@OriginalMember(owner = "client!jga", name = "db", descriptor = "I")
	public int anInt6204 = 2;

	@OriginalMember(owner = "client!jga", name = "t", descriptor = "I")
	public int anInt6185 = 127;

	@OriginalMember(owner = "client!jga", name = "z", descriptor = "I")
	public int anInt6189 = 127;

	@OriginalMember(owner = "client!jga", name = "M", descriptor = "I")
	public int anInt6196 = 127;

	@OriginalMember(owner = "client!jga", name = "ab", descriptor = "I")
	public int anInt6202 = 0;

	@OriginalMember(owner = "client!jga", name = "eb", descriptor = "I")
	public int anInt6205 = 127;

	static {
		for (@Pc(10) int local10 = 0; local10 < 4096; local10++) {
			anIntArray363[local10] = Static131.method2301(local10);
		}
	}

	@OriginalMember(owner = "client!jga", name = "<init>", descriptor = "()V")
	protected Class1_Sub30() {
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(IB)Z")
	public final boolean method5019(@OriginalArg(0) int arg0) {
		return Static224.method3332(arg0) ? this.aBoolean473 : this.aBoolean472;
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(BLclient!ac;)V")
	public final void method5021(@OriginalArg(1) Class1_Sub3 arg0) {
		arg0.method7917(22);
		arg0.method7917(this.anInt6184);
		arg0.method7917(this.aBoolean489 ? 1 : 0);
		arg0.method7917(this.aBoolean483 ? 1 : 0);
		arg0.method7917(this.aBoolean487 ? 1 : 0);
		arg0.method7917(this.aBoolean486 ? 1 : 0);
		arg0.method7917(0);
		arg0.method7917(this.aBoolean488 ? 1 : 0);
		arg0.method7917(this.aBoolean484 ? 1 : 0);
		arg0.method7917(this.aBoolean477 ? 1 : 0);
		arg0.method7917(this.anInt6198);
		arg0.method7917(this.anInt6191);
		arg0.method7917(this.aBoolean473 ? 1 : 0);
		arg0.method7917(this.aBoolean472 ? 1 : 0);
		arg0.method7917(this.aBoolean478 ? 1 : 0);
		arg0.method7917(this.aBoolean476 ? 1 : 0);
		arg0.method7917(this.anInt6202);
		arg0.method7917(this.aBoolean479 ? 1 : 0);
		arg0.method7917(this.anInt6185);
		arg0.method7917(this.anInt6205);
		arg0.method7917(this.anInt6189);
		arg0.method7917(this.anInt6196);
		arg0.method7917(this.anInt6192);
		arg0.method7937(this.anInt6190);
		arg0.method7937(this.anInt6201);
		arg0.method7917(Static209.method7199());
		arg0.method7936(this.anInt6194);
		arg0.method7917(this.anInt6199);
		arg0.method7917(this.aBoolean482 ? 1 : 0);
		arg0.method7917(this.aBoolean485 ? 1 : 0);
		arg0.method7917(this.anInt6197);
		arg0.method7917(this.aBoolean474 ? 1 : 0);
		arg0.method7917(this.aBoolean481 ? 1 : 0);
		arg0.method7917(this.anInt6193);
		arg0.method7917(this.aBoolean480 ? 1 : 0);
		arg0.method7917(this.anInt6200);
		arg0.method7917(this.anInt6204);
		arg0.method7917(this.aBoolean475 ? 1 : 0);
		arg0.method7917(this.anInt6195);
		arg0.method7917(this.anInt6182);
		arg0.method7917(this.anInt6180);
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(IZI)V")
	public final void method5022(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static224.method3332(arg1)) {
			this.anInt6198 = arg0;
		} else {
			this.anInt6191 = arg0;
		}
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(IZ)I")
	public final int method5023(@OriginalArg(0) int arg0) {
		return Static224.method3332(arg0) ? this.anInt6198 : this.anInt6191;
	}

	@OriginalMember(owner = "client!jga", name = "b", descriptor = "(IZI)V")
	public final void method5024(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		if (Static224.method3332(arg1)) {
			this.aBoolean473 = arg0;
		} else {
			this.aBoolean472 = arg0;
		}
	}
}
