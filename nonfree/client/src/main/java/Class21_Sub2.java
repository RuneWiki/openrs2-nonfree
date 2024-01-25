import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public final class Class21_Sub2 extends Class21 implements Interface16 {

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Lclient!tm;Z)V")
	public Class21_Sub2(@OriginalArg(0) Class4_Sub2_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(ILclient!jaclib/memory/Source;II)Z")
	@Override
	public boolean method7615(@OriginalArg(0) int arg0, @OriginalArg(1) Source arg1, @OriginalArg(3) int arg2) {
		super.method7611(arg1, arg0);
		return true;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZII)Z")
	@Override
	public boolean method7616(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.method7607(arg0);
		return true;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)I")
	@Override
	public int method7605() {
		return super.method7605();
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7613() {
		return super.method7613();
	}

	@OriginalMember(owner = "client!uq", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7614() {
		return this.method7614();
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(I)V")
	@Override
	public void method7609() {
		super.method7609();
	}
}
