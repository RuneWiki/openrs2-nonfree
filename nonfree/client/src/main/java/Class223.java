import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public final class Class223 {

	@OriginalMember(owner = "client!mq", name = "h", descriptor = "Lclient!se;")
	private Interface20 anInterface20_1;

	@OriginalMember(owner = "client!mq", name = "f", descriptor = "I")
	private int anInt6456 = 1;

	@OriginalMember(owner = "client!mq", name = "d", descriptor = "Lclient!sba;")
	private final Class300 aClass300_1;

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Lclient!sba;)V")
	public Class223(@OriginalArg(0) Class300 arg0) {
		this.aClass300_1 = arg0;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(BLclient!se;)V")
	public void method5089(@OriginalArg(1) Interface20 arg0) {
		if (arg0.method6812() != this.aClass300_1) {
			throw new IllegalArgumentException();
		}
		this.anInterface20_1 = arg0;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IZ)V")
	public void method5090(@OriginalArg(0) int arg0) {
		this.anInt6456 = arg0;
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(B)Lclient!se;")
	public Interface20 method5091() {
		return this.anInterface20_1;
	}

	@OriginalMember(owner = "client!mq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)I")
	public int method5092() {
		return this.anInt6456;
	}
}
