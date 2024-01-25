import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gw")
public final class Class127 {

	@OriginalMember(owner = "client!gw", name = "L", descriptor = "[I")
	public static final int[] anIntArray157 = new int[128];

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "Lclient!bk;")
	private Interface2 anInterface2_1;

	@OriginalMember(owner = "client!gw", name = "g", descriptor = "I")
	private int anInt3325 = 1;

	@OriginalMember(owner = "client!gw", name = "d", descriptor = "Lclient!mv;")
	private final Class229 aClass229_1;

	static {
		for (@Pc(134) int local134 = 0; local134 < anIntArray157.length; local134++) {
			anIntArray157[local134] = -1;
		}
		for (@Pc(150) int local150 = 65; local150 <= 90; local150++) {
			anIntArray157[local150] = local150 - 65;
		}
		for (@Pc(165) int local165 = 97; local165 <= 122; local165++) {
			anIntArray157[local165] = local165 - 71;
		}
		for (@Pc(180) int local180 = 48; local180 <= 57; local180++) {
			anIntArray157[local180] = local180 + 4;
		}
		anIntArray157[45] = anIntArray157[47] = 63;
		anIntArray157[42] = anIntArray157[43] = 62;
	}

	@OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(Lclient!mv;)V")
	public Class127(@OriginalArg(0) Class229 arg0) {
		this.aClass229_1 = arg0;
	}

	@OriginalMember(owner = "client!gw", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(II)V")
	public void method2827(@OriginalArg(1) int arg0) {
		this.anInt3325 = arg0;
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(B)I")
	public int method2828() {
		return this.anInt3325;
	}

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "(B)Lclient!bk;")
	public Interface2 method2829() {
		return this.anInterface2_1;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lclient!bk;I)V")
	public void method2830(@OriginalArg(0) Interface2 arg0) {
		if (arg0.method7053() != this.aClass229_1) {
			throw new IllegalArgumentException();
		}
		this.anInterface2_1 = arg0;
	}
}
