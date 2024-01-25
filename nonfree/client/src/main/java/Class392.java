import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public final class Class392 {

	@OriginalMember(owner = "client!wp", name = "N", descriptor = "[I")
	public static final int[] anIntArray715 = new int[4096];

	@OriginalMember(owner = "client!wp", name = "k", descriptor = "Lclient!ep;")
	private Interface8 anInterface8_1;

	@OriginalMember(owner = "client!wp", name = "d", descriptor = "Lclient!jea;")
	private final Class173 aClass173_5;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "I")
	private int anInt10768;

	static {
		for (@Pc(139) int local139 = 0; local139 < 4096; local139++) {
			anIntArray715[local139] = Static494.method7138(local139);
		}
	}

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(Lclient!jea;)V")
	public Class392(@OriginalArg(0) Class173 arg0) {
		this.aClass173_5 = arg0;
		this.anInt10768 = 1;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)I")
	public int method9096() {
		return this.anInt10768;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!ep;I)V")
	public void method9098(@OriginalArg(0) Interface8 arg0) {
		if (arg0.method9104() != this.aClass173_5) {
			throw new IllegalArgumentException();
		}
		this.anInterface8_1 = arg0;
	}

	@OriginalMember(owner = "client!wp", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(Z)Lclient!ep;")
	public Interface8 method9101() {
		return this.anInterface8_1;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZI)V")
	public void method9103(@OriginalArg(1) int arg0) {
		this.anInt10768 = arg0;
	}
}
