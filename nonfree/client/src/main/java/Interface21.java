import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public interface Interface21 {

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(I)I")
	int method8971();

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(Z)J")
	long method8972();

	@OriginalMember(owner = "client!sda", name = "b", descriptor = "(I)I")
	int method8973();

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "([BIIZ)V")
	void method8974(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1);
}
