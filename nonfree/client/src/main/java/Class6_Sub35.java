import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public final class Class6_Sub35 extends Class6 {

	@OriginalMember(owner = "client!pq", name = "m", descriptor = "Z")
	public boolean aBoolean531;

	@OriginalMember(owner = "client!pq", name = "o", descriptor = "Z")
	public boolean aBoolean532;

	@OriginalMember(owner = "client!pq", name = "s", descriptor = "Z")
	public boolean aBoolean534;

	@OriginalMember(owner = "client!pq", name = "t", descriptor = "I")
	public final int anInt7971;

	@OriginalMember(owner = "client!pq", name = "r", descriptor = "Z")
	public final boolean aBoolean533;

	@OriginalMember(owner = "client!pq", name = "n", descriptor = "I")
	public final int anInt7969;

	@OriginalMember(owner = "client!pq", name = "p", descriptor = "Lclient!vg;")
	public final Class62_Sub1 aClass62_Sub1_1;

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(ILclient!vg;IZ)V")
	public Class6_Sub35(@OriginalArg(0) int arg0, @OriginalArg(1) Class62_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt7971 = arg2;
		this.aBoolean533 = arg3;
		this.anInt7969 = arg0;
		this.aClass62_Sub1_1 = arg1;
	}
}
