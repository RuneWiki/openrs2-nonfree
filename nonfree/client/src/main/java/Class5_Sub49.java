import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class5_Sub49 extends Class5 {

	@OriginalMember(owner = "client!ua", name = "n", descriptor = "B")
	public byte aByte136;

	@OriginalMember(owner = "client!ua", name = "o", descriptor = "Z")
	private boolean aBoolean706;

	@OriginalMember(owner = "client!ua", name = "s", descriptor = "[I")
	private int[] anIntArray530;

	@OriginalMember(owner = "client!ua", name = "t", descriptor = "[Lclient!jv;")
	public Class192[] aClass192Array1;

	@OriginalMember(owner = "client!ua", name = "v", descriptor = "J")
	public long aLong291;

	@OriginalMember(owner = "client!ua", name = "A", descriptor = "B")
	public byte aByte137;

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "I")
	public int anInt9624 = 0;

	@OriginalMember(owner = "client!ua", name = "x", descriptor = "Z")
	private boolean aBoolean707 = true;

	@OriginalMember(owner = "client!ua", name = "m", descriptor = "Ljava/lang/String;")
	public String aString103 = null;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lclient!rv;)V")
	public Class5_Sub49(@OriginalArg(0) Class5_Sub15 arg0) {
		this.method8001(arg0);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)V")
	private void method7993(@OriginalArg(0) int arg0) {
		if (this.aClass192Array1 == null) {
			this.aClass192Array1 = new Class192[arg0];
		} else {
			Static685.method8331(this.aClass192Array1, 0, this.aClass192Array1 = new Class192[arg0], 0, this.anInt9624);
		}
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)V")
	public void method7994(@OriginalArg(1) int arg0) {
		this.anInt9624--;
		if (this.anInt9624 == 0) {
			this.aClass192Array1 = null;
		} else {
			Static685.method8331(this.aClass192Array1, arg0 + 1, this.aClass192Array1, arg0, this.anInt9624 - arg0);
		}
		this.anIntArray530 = null;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method7996(@OriginalArg(0) String arg0) {
		for (@Pc(12) int local12 = 0; local12 < this.anInt9624; local12++) {
			if (this.aClass192Array1[local12].aString42.equalsIgnoreCase(arg0)) {
				return local12;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)[I")
	public int[] method7998() {
		if (this.anIntArray530 == null) {
			@Pc(10) String[] local10 = new String[this.anInt9624];
			this.anIntArray530 = new int[this.anInt9624];
			@Pc(17) int local17 = 0;
			while (this.anInt9624 > local17) {
				local10[local17] = this.aClass192Array1[local17].aString42;
				this.anIntArray530[local17] = local17++;
			}
			Static59.method5266(this.anIntArray530, local10);
		}
		return this.anIntArray530;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!jv;B)V")
	public void method7999(@OriginalArg(0) Class192 arg0) {
		if (this.aClass192Array1 == null || this.anInt9624 >= this.aClass192Array1.length) {
			this.method7993(this.anInt9624 + 5);
		}
		this.aClass192Array1[this.anInt9624++] = arg0;
		this.anIntArray530 = null;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!rv;I)V")
	private void method8001(@OriginalArg(0) Class5_Sub15 arg0) {
		@Pc(7) int local7 = arg0.method3642();
		if ((local7 & 0x2) != 0) {
			this.aBoolean707 = true;
		}
		if ((local7 & 0x1) != 0) {
			this.aBoolean706 = true;
		}
		super.aLong329 = arg0.method3634();
		this.aLong291 = arg0.method3634();
		this.aString103 = arg0.method3661();
		arg0.method3642();
		this.aByte136 = arg0.method3677();
		this.aByte137 = arg0.method3677();
		this.anInt9624 = arg0.method3698();
		if (this.anInt9624 <= 0) {
			return;
		}
		this.aClass192Array1 = new Class192[this.anInt9624];
		for (@Pc(76) int local76 = 0; local76 < this.anInt9624; local76++) {
			@Pc(81) Class192 local81 = new Class192();
			if (this.aBoolean706) {
				arg0.method3634();
			}
			if (this.aBoolean707) {
				local81.aString42 = arg0.method3661();
			}
			local81.aByte52 = arg0.method3677();
			local81.anInt4514 = arg0.method3698();
			this.aClass192Array1[local76] = local81;
		}
	}
}
