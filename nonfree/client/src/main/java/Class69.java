import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fr")
public final class Class69 {

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "I")
	public int anInt2172 = -1;

	@OriginalMember(owner = "client!fr", name = "g", descriptor = "Z")
	public boolean aBoolean150 = false;

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "Z")
	public boolean aBoolean149 = true;

	@OriginalMember(owner = "client!fr", name = "e", descriptor = "I")
	public int anInt2175 = 1190717;

	@OriginalMember(owner = "client!fr", name = "p", descriptor = "I")
	public int anInt2183 = 8;

	@OriginalMember(owner = "client!fr", name = "o", descriptor = "I")
	public int anInt2182 = 0;

	@OriginalMember(owner = "client!fr", name = "j", descriptor = "I")
	public int anInt2178 = -1;

	@OriginalMember(owner = "client!fr", name = "n", descriptor = "Z")
	public boolean aBoolean151 = true;

	@OriginalMember(owner = "client!fr", name = "i", descriptor = "I")
	public int anInt2177 = 16;

	@OriginalMember(owner = "client!fr", name = "k", descriptor = "I")
	public int anInt2179 = -1;

	@OriginalMember(owner = "client!fr", name = "s", descriptor = "I")
	public int anInt2186 = 128;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(BILclient!jg;)V")
	public void method2165(@OriginalArg(1) int arg0, @OriginalArg(2) Class14_Sub4 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method2548();
			if (local5 == 0) {
				return;
			}
			this.method2168(local5, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)V")
	public void method2167(@OriginalArg(1) int arg0) {
		if (this.anInt2178 == -1) {
			this.anInt2178 = this.anInt2172;
		}
		this.anInt2183 = this.anInt2183 << 8 | arg0;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IILclient!jg;I)V")
	private void method2168(@OriginalArg(0) int arg0, @OriginalArg(2) Class14_Sub4 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1) {
			this.anInt2182 = Static231.method4074(arg1.method2501());
		} else if (arg0 == 2) {
			this.anInt2172 = arg1.method2548();
		} else if (arg0 == 3) {
			this.anInt2172 = arg1.method2498();
			if (this.anInt2172 == 65535) {
				this.anInt2172 = -1;
			}
		} else if (arg0 == 5) {
			this.aBoolean151 = false;
		} else if (arg0 == 7) {
			this.anInt2179 = Static231.method4074(arg1.method2501());
		} else if (arg0 == 8) {
			Static193.anInt3950 = arg2;
		} else if (arg0 == 9) {
			this.anInt2186 = arg1.method2498();
		} else if (arg0 == 10) {
			this.aBoolean149 = false;
		} else if (arg0 == 11) {
			this.anInt2183 = arg1.method2548();
		} else if (arg0 == 12) {
			this.aBoolean150 = true;
		} else if (arg0 == 13) {
			this.anInt2175 = arg1.method2501();
		} else if (arg0 == 14) {
			this.anInt2177 = arg1.method2548();
		} else if (arg0 == 15) {
			this.anInt2178 = arg1.method2498();
			if (this.anInt2178 == 65535) {
				this.anInt2178 = -1;
			}
		}
	}
}
