import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public interface Interface12 {

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)I")
	int method5493();

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(IB[BI)V")
	void method5494(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "(I)J")
	long method5495();

	@OriginalMember(owner = "client!kda", name = "c", descriptor = "(I)I")
	int method5496();
}
