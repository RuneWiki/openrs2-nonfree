import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public final class Class2_Sub9_Sub4 extends Class2_Sub9 {

	@OriginalMember(owner = "client!fb", name = "K", descriptor = "I")
	public int anInt1719;

	@OriginalMember(owner = "client!fb", name = "O", descriptor = "I")
	public int anInt1723;

	@OriginalMember(owner = "client!fb", name = "S", descriptor = "Ljava/lang/String;")
	public String aString16;

	@OriginalMember(owner = "client!fb", name = "W", descriptor = "I")
	public int anInt1729;

	static {
		new Class140("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
	}

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(II)V")
	public Class2_Sub9_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong219 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "(I)J")
	public long method1793() {
		return super.aLong211 & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "(B)I")
	public int method1794() {
		return (int) super.aLong219;
	}

	@OriginalMember(owner = "client!fb", name = "j", descriptor = "(I)V")
	public void method1799() {
		super.aLong211 = Long.MIN_VALUE & super.aLong211 | Static22.method285() + 500L;
		Static77.aClass129_2.method3575(this);
	}

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "(I)I")
	public int method1800() {
		return (int) (super.aLong219 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)V")
	public void method1801() {
		super.aLong211 |= Long.MIN_VALUE;
		if (this.method1793() == 0L) {
			Static148.aClass129_7.method3575(this);
		}
	}
}
