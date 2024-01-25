import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public interface Interface5 {

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(Z)J")
	long method6821();

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(B)I")
	int method6822();

	@OriginalMember(owner = "client!eea", name = "b", descriptor = "(B)I")
	int method6823();

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(I[BII)V")
	void method6824(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1);
}
