import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public final class Class272_Sub2 extends Class272 implements Interface10 {

	@OriginalMember(owner = "client!tp", name = "D", descriptor = "Lclient!ti;")
	private final Class324 aClass324_17;

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Lclient!eea;Lclient!ti;Z)V")
	public Class272_Sub2(@OriginalArg(0) Class87_Sub1_Sub1 arg0, @OriginalArg(1) Class324 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass324_17 = arg1;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Z)V")
	@Override
	public void method7671() {
		super.method7671();
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(II)V")
	@Override
	public void method7675(@OriginalArg(0) int arg0) {
		super.method7675(arg0 * this.aClass324_17.anInt9051);
	}

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "(I)I")
	@Override
	public int method7668() {
		return super.method7668();
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)Lclient!ti;")
	@Override
	public Class324 method7681() {
		return this.aClass324_17;
	}

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7683() {
		return super.method7672(super.aClass87_Sub1_Sub1_12.aMapBuffer1);
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7682() {
		return super.method7678(super.aClass87_Sub1_Sub1_12.aMapBuffer1);
	}
}
