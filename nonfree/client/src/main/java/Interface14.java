import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public interface Interface14 {

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(I)J")
	long method8574();

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(III[B)V")
	void method8575(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1);

	@OriginalMember(owner = "client!jda", name = "b", descriptor = "(I)I")
	int method8576();

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(Z)I")
	int method8577();
}
