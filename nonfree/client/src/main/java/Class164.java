import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public final class Class164 {

	@OriginalMember(owner = "client!jr", name = "j", descriptor = "Lclient!hv;")
	private Interface8 anInterface8_1;

	@OriginalMember(owner = "client!jr", name = "h", descriptor = "Lclient!cj;")
	private final Class56 aClass56_5;

	@OriginalMember(owner = "client!jr", name = "e", descriptor = "I")
	private int anInt5051;

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Lclient!cj;)V")
	public Class164(@OriginalArg(0) Class56 arg0) {
		this.aClass56_5 = arg0;
		this.anInt5051 = 1;
	}

	@OriginalMember(owner = "client!jr", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)I")
	public int method4035() {
		return this.anInt5051;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Z)Lclient!hv;")
	public Interface8 method4038() {
		return this.anInterface8_1;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(BLclient!hv;)V")
	public void method4039(@OriginalArg(1) Interface8 arg0) {
		if (arg0.method7898() != this.aClass56_5) {
			throw new IllegalArgumentException();
		}
		this.anInterface8_1 = arg0;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(II)V")
	public void method4040(@OriginalArg(0) int arg0) {
		this.anInt5051 = arg0;
	}
}
