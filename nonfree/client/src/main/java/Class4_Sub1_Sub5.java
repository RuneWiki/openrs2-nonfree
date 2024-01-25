import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public final class Class4_Sub1_Sub5 extends Class4_Sub1 {

	@OriginalMember(owner = "client!br", name = "D", descriptor = "Ljava/lang/String;")
	public String aString2;

	@OriginalMember(owner = "client!br", name = "F", descriptor = "I")
	public int anInt614;

	@OriginalMember(owner = "client!br", name = "H", descriptor = "I")
	public int anInt616;

	@OriginalMember(owner = "client!br", name = "O", descriptor = "I")
	public int anInt621;

	static {
		new Class21("clan_chat", "clanchat", "conversation_clan", "clan_chat");
	}

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(II)V")
	public Class4_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong228 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!br", name = "e", descriptor = "(I)I")
	public int method515() {
		return (int) (super.aLong228 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!br", name = "e", descriptor = "(B)V")
	public void method517() {
		super.aLong219 = Static167.method2929() + 500L | Long.MIN_VALUE & super.aLong219;
		Static291.aClass252_9.method5694(this);
	}

	@OriginalMember(owner = "client!br", name = "f", descriptor = "(B)I")
	public int method518() {
		return (int) super.aLong228;
	}

	@OriginalMember(owner = "client!br", name = "f", descriptor = "(I)J")
	public long method520() {
		return Long.MAX_VALUE & super.aLong219;
	}

	@OriginalMember(owner = "client!br", name = "g", descriptor = "(I)V")
	public void method521() {
		super.aLong219 |= Long.MIN_VALUE;
		if (this.method520() == 0L) {
			Static127.aClass252_2.method5694(this);
		}
	}
}
