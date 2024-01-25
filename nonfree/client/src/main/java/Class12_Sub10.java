import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public abstract class Class12_Sub10 extends Class12 {

	@OriginalMember(owner = "client!oaa", name = "p", descriptor = "Z")
	protected boolean aBoolean175;

	@OriginalMember(owner = "client!oaa", name = "r", descriptor = "Z")
	protected boolean aBoolean176;

	@OriginalMember(owner = "client!oaa", name = "L", descriptor = "Z")
	public boolean aBoolean184;

	@OriginalMember(owner = "client!oaa", name = "w", descriptor = "I")
	public int anInt2222 = 127;

	@OriginalMember(owner = "client!oaa", name = "D", descriptor = "Z")
	public boolean aBoolean180 = false;

	@OriginalMember(owner = "client!oaa", name = "I", descriptor = "I")
	public int anInt2229 = 0;

	@OriginalMember(owner = "client!oaa", name = "y", descriptor = "I")
	public int anInt2224 = 3;

	@OriginalMember(owner = "client!oaa", name = "E", descriptor = "I")
	public int anInt2227 = 127;

	@OriginalMember(owner = "client!oaa", name = "M", descriptor = "Z")
	protected boolean aBoolean185 = true;

	@OriginalMember(owner = "client!oaa", name = "O", descriptor = "I")
	public int anInt2232 = 127;

	@OriginalMember(owner = "client!oaa", name = "x", descriptor = "I")
	public int anInt2223 = 0;

	@OriginalMember(owner = "client!oaa", name = "A", descriptor = "Z")
	public boolean aBoolean179 = true;

	@OriginalMember(owner = "client!oaa", name = "C", descriptor = "I")
	public int anInt2226 = 0;

	@OriginalMember(owner = "client!oaa", name = "J", descriptor = "Z")
	public boolean aBoolean183 = true;

	@OriginalMember(owner = "client!oaa", name = "K", descriptor = "I")
	public int anInt2230 = 2;

	@OriginalMember(owner = "client!oaa", name = "z", descriptor = "Z")
	public boolean aBoolean178 = true;

	@OriginalMember(owner = "client!oaa", name = "n", descriptor = "Z")
	public boolean aBoolean173 = true;

	@OriginalMember(owner = "client!oaa", name = "S", descriptor = "Z")
	public boolean aBoolean188 = true;

	@OriginalMember(owner = "client!oaa", name = "R", descriptor = "Z")
	public boolean aBoolean187 = true;

	@OriginalMember(owner = "client!oaa", name = "t", descriptor = "Z")
	public boolean aBoolean177 = false;

	@OriginalMember(owner = "client!oaa", name = "o", descriptor = "Z")
	public boolean aBoolean174 = true;

	@OriginalMember(owner = "client!oaa", name = "N", descriptor = "I")
	protected int anInt2231 = 2;

	@OriginalMember(owner = "client!oaa", name = "s", descriptor = "I")
	public int anInt2219 = 3;

	@OriginalMember(owner = "client!oaa", name = "Q", descriptor = "Z")
	public boolean aBoolean186 = true;

	@OriginalMember(owner = "client!oaa", name = "B", descriptor = "I")
	public int anInt2225 = 2;

	@OriginalMember(owner = "client!oaa", name = "V", descriptor = "I")
	public int anInt2236 = 0;

	@OriginalMember(owner = "client!oaa", name = "W", descriptor = "Z")
	public boolean aBoolean189 = false;

	@OriginalMember(owner = "client!oaa", name = "H", descriptor = "Z")
	public boolean aBoolean182 = true;

	@OriginalMember(owner = "client!oaa", name = "q", descriptor = "I")
	public int anInt2218 = 1;

	@OriginalMember(owner = "client!oaa", name = "P", descriptor = "I")
	public int anInt2233 = 2;

	@OriginalMember(owner = "client!oaa", name = "G", descriptor = "Z")
	public boolean aBoolean181 = true;

	@OriginalMember(owner = "client!oaa", name = "U", descriptor = "I")
	public int anInt2235 = 0;

	@OriginalMember(owner = "client!oaa", name = "X", descriptor = "I")
	protected int anInt2237 = 0;

	@OriginalMember(owner = "client!oaa", name = "Y", descriptor = "I")
	public int anInt2238 = 0;

	@OriginalMember(owner = "client!oaa", name = "m", descriptor = "Z")
	public boolean aBoolean172 = true;

	static {
		new Class88("clan_chat", "clanchat", "conversation_clan", "clan_chat");
		new Class88("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
	}

	@OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "()V")
	protected Class12_Sub10() {
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(II)Z")
	public final boolean method2038(@OriginalArg(0) int arg0) {
		return Static39.method807(arg0) ? this.aBoolean175 : this.aBoolean176;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ZLclient!daa;)V")
	public final void method2039(@OriginalArg(1) Class12_Sub8 arg0) {
		arg0.method5214(18);
		arg0.method5214(this.anInt2219);
		arg0.method5214(this.aBoolean185 ? 1 : 0);
		arg0.method5214(this.aBoolean173 ? 1 : 0);
		arg0.method5214(this.aBoolean183 ? 1 : 0);
		arg0.method5214(this.aBoolean187 ? 1 : 0);
		arg0.method5214(0);
		arg0.method5214(this.aBoolean179 ? 1 : 0);
		arg0.method5214(this.aBoolean188 ? 1 : 0);
		arg0.method5214(this.aBoolean182 ? 1 : 0);
		arg0.method5214(this.anInt2231);
		arg0.method5214(this.anInt2237);
		arg0.method5214(this.aBoolean175 ? 1 : 0);
		arg0.method5214(this.aBoolean176 ? 1 : 0);
		arg0.method5214(this.aBoolean178 ? 1 : 0);
		arg0.method5214(this.aBoolean174 ? 1 : 0);
		arg0.method5214(this.anInt2229);
		arg0.method5214(this.aBoolean181 ? 1 : 0);
		arg0.method5214(this.anInt2232);
		arg0.method5214(this.anInt2227);
		arg0.method5214(this.anInt2222);
		arg0.method5190(this.anInt2236);
		arg0.method5190(this.anInt2223);
		arg0.method5214(Static395.method6206());
		arg0.method5223(this.anInt2238);
		arg0.method5214(this.anInt2225);
		arg0.method5214(this.aBoolean189 ? 1 : 0);
		arg0.method5214(this.aBoolean184 ? 1 : 0);
		arg0.method5214(this.anInt2235);
		arg0.method5214(this.aBoolean177 ? 1 : 0);
		arg0.method5214(this.aBoolean172 ? 1 : 0);
		arg0.method5214(this.anInt2218);
		arg0.method5214(this.aBoolean186 ? 1 : 0);
		arg0.method5214(this.anInt2230);
		arg0.method5214(this.anInt2233);
		arg0.method5214(this.aBoolean180 ? 1 : 0);
		arg0.method5214(this.anInt2224);
	}

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "(III)V")
	public final void method2042(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static39.method807(arg0)) {
			this.anInt2231 = arg1;
		} else {
			this.anInt2237 = arg1;
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IB)I")
	public final int method2043(@OriginalArg(0) int arg0) {
		return Static39.method807(arg0) ? this.anInt2231 : this.anInt2237;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ZII)V")
	public final void method2044(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (Static39.method807(arg1)) {
			this.aBoolean175 = arg0;
		} else {
			this.aBoolean176 = arg0;
		}
	}
}
