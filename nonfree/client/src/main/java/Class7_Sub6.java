import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public abstract class Class7_Sub6 extends Class7 {

	@OriginalMember(owner = "client!pq", name = "l", descriptor = "Z")
	public boolean aBoolean82;

	@OriginalMember(owner = "client!pq", name = "m", descriptor = "Lclient!hd;")
	protected final Class89_Sub1 aClass89_Sub1_8;

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lclient!hd;)V")
	public Class7_Sub6(@OriginalArg(0) Class89_Sub1 arg0) {
		this.aClass89_Sub1_8 = arg0;
	}

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "(I)V")
	public abstract void method856(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "()Z")
	public abstract boolean method857();

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "()I")
	public int method858() {
		return 0;
	}

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "()Z")
	public abstract boolean method859();

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "()V")
	public abstract void method860();

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "(B)Z")
	public final boolean method861() {
		return false;
	}

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "(I)Z")
	public final boolean method862() {
		return this.aBoolean82;
	}

	@OriginalMember(owner = "client!pq", name = "e", descriptor = "(I)I")
	public final int method863() {
		return 1;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(II)V")
	public abstract void method864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILclient!oe;Lclient!oe;)V")
	public abstract void method865(@OriginalArg(0) int arg0, @OriginalArg(1) Class92_Sub4 arg1, @OriginalArg(2) Class92_Sub4 arg2);
}
