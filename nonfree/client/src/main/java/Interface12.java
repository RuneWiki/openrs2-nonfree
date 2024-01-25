import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public interface Interface12 {

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)J")
	long method5810();

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(B)I")
	int method5811();

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "([BIII)V")
	void method5812(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)I")
	int method5813();
}
