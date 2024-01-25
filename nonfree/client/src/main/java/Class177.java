import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public class Class177 implements Interface9 {

	@OriginalMember(owner = "client!nda", name = "f", descriptor = "I")
	public final int anInt4702;

	@OriginalMember(owner = "client!nda", name = "b", descriptor = "I")
	public final int anInt4699;

	@OriginalMember(owner = "client!nda", name = "j", descriptor = "I")
	public final int anInt4704;

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "Lclient!nha;")
	public final Class245 aClass245_11;

	@OriginalMember(owner = "client!nda", name = "i", descriptor = "Lclient!jn;")
	public final Class183 aClass183_8;

	@OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(ILclient!nha;Lclient!jn;II)V")
	public Class177(@OriginalArg(0) int arg0, @OriginalArg(1) Class245 arg1, @OriginalArg(2) Class183 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt4702 = arg0;
		this.anInt4699 = arg3;
		this.anInt4704 = arg4;
		this.aClass245_11 = arg1;
		this.aClass183_8 = arg2;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(I)Lclient!vj;")
	@Override
	public Class365 method9019() {
		return Static522.aClass365_15;
	}
}
