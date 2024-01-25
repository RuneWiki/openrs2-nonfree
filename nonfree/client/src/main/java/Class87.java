import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dma")
public final class Class87 {

	@OriginalMember(owner = "client!dma", name = "e", descriptor = "J")
	public final long aLong72;

	@OriginalMember(owner = "client!dma", name = "b", descriptor = "Lclient!uja;")
	private final Class145_Sub3 aClass145_Sub3_8;

	@OriginalMember(owner = "client!dma", name = "<init>", descriptor = "(Lclient!uja;JI)V")
	public Class87(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong72 = arg1;
		this.aClass145_Sub3_8 = arg0;
	}

	@OriginalMember(owner = "client!dma", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass145_Sub3_8.method8878(this.aLong72);
		super.finalize();
	}
}
