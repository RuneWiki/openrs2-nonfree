import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public final class Class21_Sub1 extends Class21 implements Interface9 {

	@OriginalMember(owner = "client!baa", name = "y", descriptor = "Lclient!vp;")
	private final Class308 aClass308_3;

	static {
		new Class45("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
	}

	@OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Lclient!tm;Lclient!vp;Z)V")
	public Class21_Sub1(@OriginalArg(0) Class4_Sub2_Sub2 arg0, @OriginalArg(1) Class308 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass308_3 = arg1;
	}

	@OriginalMember(owner = "client!baa", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7614() {
		return super.method7614();
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(II)V")
	@Override
	public void method7607(@OriginalArg(1) int arg0) {
		super.method7607(this.aClass308_3.anInt9154 * arg0);
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)I")
	@Override
	public int method7605() {
		return super.method7605();
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7613() {
		return super.method7613();
	}

	@OriginalMember(owner = "client!baa", name = "b", descriptor = "(I)V")
	@Override
	public void method7609() {
		super.method7609();
	}

	@OriginalMember(owner = "client!baa", name = "c", descriptor = "(I)Lclient!vp;")
	@Override
	public Class308 method3626() {
		return this.aClass308_3;
	}
}
